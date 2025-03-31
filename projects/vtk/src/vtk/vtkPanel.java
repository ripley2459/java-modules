package vtk;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.SwingUtilities;


/**
 * Java AWT component that encapsulate vtkRenderWindow, vtkRenderer, vtkCamera, vtkLight.
 *
 * If a vtkInteractor is needed, use vtkCanvas instead. This is necessary when Widget and Picker are used.
 *
 * @author Kitware
 */
public class vtkPanel extends Canvas implements MouseListener, MouseMotionListener, MouseWheelListener, KeyListener
{
	private static final long serialVersionUID	= 1L;
	protected vtkRenderWindow rw				= new vtkOpenGLRenderWindow();
	protected vtkRenderer	  ren				= new vtkRenderer();
	protected vtkCamera		  cam				= null;
	protected vtkLight		  lgt				= new vtkLight();
	protected int			  lastX;
	protected int			  lastY;
	protected int			  windowset			= 0;
	protected int			  lightingset		= 0;
	protected int			  LightFollowCamera	= 1;
	protected int			  InteractionMode	= 1;
	protected boolean		  rendering			= false;

	// Allow access to display lock() and unlock().
	// Call these whenever you call something that causes
	// a Render().
	// e.g.
	// panel.lock();
	// // Code that causes a render
	// panel.unlock();
	public void lock()
	{
		Lock();
	}

	public void unlock()
	{
		UnLock();
	}

	public void Delete()
	{
		if (rendering)
		{
			return;
		}
		rendering = true;
		// We prevent any further rendering

		if (getParent() != null)
		{
			getParent().remove(this);
		}
		// Free internal VTK objects
		ren = null;
		cam = null;
		lgt = null;
		// On linux we prefer to have a memory leak instead of a crash
		if (!rw.GetClassName().equals("vtkXOpenGLRenderWindow"))
		{
			rw = null;
		}
		else
		{
			System.out.println("The renderwindow has been kept around to prevent a crash");
		}
	}

	protected native int RenderCreate(vtkRenderWindow id0);

	protected native int Lock();

	protected native int UnLock();

	public vtkPanel()
	{
		rw.AddRenderer(ren);
		addMouseListener(this);
		addMouseMotionListener(this);
		addMouseWheelListener(this);
		addKeyListener(this);
		super.setSize(200, 200);
		rw.SetSize(200, 200);
	}

	public vtkPanel(final vtkRenderWindow renwin)
	{
		rw = renwin;
		rw.AddRenderer(ren);
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		super.setSize(200, 200);
		rw.SetSize(200, 200);
	}

	public void Report()
	{

		// must be performed on awt event thread
		final Runnable updateAComponent = new Runnable()
		{
			@Override
			public void run()
			{
				Lock();
				System.out.println("direct rendering = " + (rw.IsDirect() == 1));
				System.out.println("opengl supported = " + (rw.SupportsOpenGL() == 1));
				System.out.println("report = " + rw.ReportCapabilities());
				UnLock();
			}
		};

		SwingUtilities.invokeLater(updateAComponent);
	}

	public vtkRenderer GetRenderer()
	{
		return ren;
	}

	public vtkRenderWindow GetRenderWindow()
	{
		return rw;
	}

	@Override
	public void setSize(final int x, final int y)
	{
		super.setSize(x, y);
		if (windowset == 1)
		{
			Lock();
			rw.SetSize(EkScaling.getScaledValueX(getWidth()), EkScaling.getScaledValueY(getHeight()));
			UnLock();
		}
	}

	@Override
	public void addNotify()
	{
		super.addNotify();
		windowset = 0;
		rw.SetForceMakeCurrent();
		rendering = false;
	}

	@Override
	public void removeNotify()
	{
		rendering = true;
		super.removeNotify();
	}

	public synchronized void Render()
	{
		if (!rendering)
		{
			rendering = true;
			if (ren.VisibleActorCount() == 0)
			{
				rendering = false;
				return;
			}
			if (rw != null)
			{
				if (windowset == 0)
				{
					// set the window id and the active camera
					cam = ren.GetActiveCamera();
					if (lightingset == 0)
					{
						ren.AddLight(lgt);
						lgt.SetPosition(cam.GetPosition());
						lgt.SetFocalPoint(cam.GetFocalPoint());
						lightingset = 1;
					}
					RenderCreate(rw);
					Lock();

					rw.SetSize(EkScaling.getScaledValueX(getWidth()), EkScaling.getScaledValueY(getHeight()));
					UnLock();
					windowset = 1;
					this.setSize(getWidth(), getHeight());
				}
				Lock();
				rw.Render();
				if (rw instanceof vtkOpenGLRenderWindow)
				{
					((vtkOpenGLRenderWindow) rw).BlitDisplayFramebuffer();
				}
				UnLock();
				rendering = false;
			}
		}
	}

	public boolean isWindowSet()
	{
		return (windowset == 1);
	}

	@Override
	public void paint(final Graphics g)
	{
		Render();
	}

	@Override
	public void update(final Graphics g)
	{
		paint(g);
	}

	public void LightFollowCameraOn()
	{
		LightFollowCamera = 1;
	}

	public void LightFollowCameraOff()
	{
		LightFollowCamera = 0;
	}

	public void InteractionModeRotate()
	{
		InteractionMode = 1;
	}

	public void InteractionModeTranslate()
	{
		InteractionMode = 2;
	}

	public void InteractionModeZoom()
	{
		InteractionMode = 3;
	}

	public void UpdateLight()
	{
		lgt.SetPosition(cam.GetPosition());
		lgt.SetFocalPoint(cam.GetFocalPoint());
	}

	public void resetCameraClippingRange()
	{
		Lock();
		ren.ResetCameraClippingRange();
		UnLock();
	}

	public void resetCamera()
	{
		Lock();
		ren.ResetCamera();
		UnLock();
	}

	@Override
	public void mouseClicked(final MouseEvent e)
	{}

	@Override
	public void mousePressed(final MouseEvent e)
	{

		if (ren.VisibleActorCount() == 0)
		{
			return;
		}
		rw.SetDesiredUpdateRate(5.0);
		lastX = e.getX();
		lastY = e.getY();
		final int mods = e.getModifiersEx();
		final int ShiftMouseButton1 = InputEvent.BUTTON1_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK;
		final int MouseButton2 = InputEvent.BUTTON2_DOWN_MASK;
		final int MouseButton3 = InputEvent.BUTTON3_DOWN_MASK;
		if (((mods & MouseButton2) == MouseButton2) || ((mods & ShiftMouseButton1) == ShiftMouseButton1))
		{
			InteractionModeTranslate();
		}
		else if ((mods & MouseButton3) == MouseButton3)
		{
			InteractionModeZoom();
		}
		else
		{
			InteractionModeRotate();
		}
	}

	@Override
	public void mouseReleased(final MouseEvent e)
	{
		rw.SetDesiredUpdateRate(0.01);
	}

	@Override
	public void mouseEntered(final MouseEvent e)
	{
		this.requestFocus();
	}

	@Override
	public void mouseExited(final MouseEvent e)
	{}

	@Override
	public void mouseMoved(final MouseEvent e)
	{
		lastX = e.getX();
		lastY = e.getY();
	}

	@Override
	public void mouseDragged(final MouseEvent e)
	{
		if (ren.VisibleActorCount() == 0)
		{
			return;
		}
		final int x = e.getX();
		final int y = e.getY();
		// rotate
		if (InteractionMode == 1)
		{
			cam.Azimuth(lastX - x);
			cam.Elevation(y - lastY);
			cam.OrthogonalizeViewUp();
			resetCameraClippingRange();
			if (LightFollowCamera == 1)
			{
				lgt.SetPosition(cam.GetPosition());
				lgt.SetFocalPoint(cam.GetFocalPoint());
			}
		}
		// translate
		if (InteractionMode == 2)
		{
			double FPoint[];
			double PPoint[];
			final double APoint[] = new double[3];
			double RPoint[];
			double focalDepth;

			// get the current focal point and position
			FPoint = cam.GetFocalPoint();
			PPoint = cam.GetPosition();

			// calculate the focal depth since we'll be using it a lot
			ren.SetWorldPoint(FPoint[0], FPoint[1], FPoint[2], 1.0);
			ren.WorldToDisplay();
			focalDepth = ren.GetDisplayPoint()[2];

			APoint[0] = (rw.GetSize()[0] / 2.0) + (x - lastX);
			APoint[1] = (rw.GetSize()[1] / 2.0) - (y - lastY);
			APoint[2] = focalDepth;
			ren.SetDisplayPoint(APoint);
			ren.DisplayToWorld();
			RPoint = ren.GetWorldPoint();
			if (RPoint[3] != 0.0)
			{
				RPoint[0] = RPoint[0] / RPoint[3];
				RPoint[1] = RPoint[1] / RPoint[3];
				RPoint[2] = RPoint[2] / RPoint[3];
			}

			/*
			 * Compute a translation vector, moving everything 1/2 the distance to the cursor. (Arbitrary scale factor)
			 */
			cam.SetFocalPoint(((FPoint[0] - RPoint[0]) / 2.0) + FPoint[0], ((FPoint[1] - RPoint[1]) / 2.0) + FPoint[1], ((FPoint[2] - RPoint[2]) / 2.0) + FPoint[2]);
			cam.SetPosition(((FPoint[0] - RPoint[0]) / 2.0) + PPoint[0], ((FPoint[1] - RPoint[1]) / 2.0) + PPoint[1], ((FPoint[2] - RPoint[2]) / 2.0) + PPoint[2]);
			resetCameraClippingRange();
		}
		// zoom
		if (InteractionMode == 3)
		{
			double zoomFactor;
			zoomFactor = Math.pow(1.02, (y - lastY));
			if (cam.GetParallelProjection() == 1)
			{
				cam.SetParallelScale(cam.GetParallelScale() / zoomFactor);
			}
			else
			{
				cam.Dolly(zoomFactor);
				resetCameraClippingRange();
			}
		}
		lastX = x;
		lastY = y;
		Render();
	}

	@Override
	public void mouseWheelMoved(final MouseWheelEvent e)
	{
		if ((ren.VisibleActorCount() == 0) || (e.getWheelRotation() == 0))
		{
			return;
		}
		int exponent;
		exponent = (-10 * e.getWheelRotation()) / Math.abs(e.getWheelRotation());
		double zoomFactor;
		zoomFactor = Math.pow(1.02, exponent);
		if (cam.GetParallelProjection() == 1)
		{
			cam.SetParallelScale(cam.GetParallelScale() / zoomFactor);
		}
		else
		{
			cam.Dolly(zoomFactor);
			resetCameraClippingRange();
		}
		Render();
	}

	@Override
	public void keyTyped(final KeyEvent e)
	{}

	@Override
	public void keyPressed(final KeyEvent e)
	{
		if (ren.VisibleActorCount() == 0)
		{
			return;
		}
		final char keyChar = e.getKeyChar();

		if ('r' == keyChar)
		{
			resetCamera();
			Render();
		}
		if ('u' == keyChar)
		{
			pickActor(lastX, lastY);
		}
		if ('w' == keyChar)
		{
			vtkActorCollection ac;
			vtkActor anActor;
			int i;

			ac = ren.GetActors();
			ac.InitTraversal();
			for (i = 0; i < ac.GetNumberOfItems(); i++)
			{
				anActor = ac.GetNextActor();
				anActor.GetProperty().SetRepresentationToWireframe();
			}
			Render();
		}
		if ('s' == keyChar)
		{
			vtkActorCollection ac;
			vtkActor anActor;
			int i;

			ac = ren.GetActors();
			ac.InitTraversal();
			for (i = 0; i < ac.GetNumberOfItems(); i++)
			{
				anActor = ac.GetNextActor();
				anActor.GetProperty().SetRepresentationToSurface();
			}
			Render();
		}
	}

	public void HardCopy(final String filename, final int mag)
	{

		Lock();

		final vtkWindowToImageFilter w2if = new vtkWindowToImageFilter();
		w2if.SetInput(rw);

		w2if.SetScale(mag);
		w2if.Update();

		final vtkTIFFWriter writer = new vtkTIFFWriter();
		writer.SetInputConnection(w2if.GetOutputPort());
		writer.SetFileName(filename);
		writer.Write();

		UnLock();
	}

	public void pickActor(final int x, final int y)
	{

		final vtkPropPicker picker = new vtkPropPicker();

		Lock();
		picker.PickProp(x, rw.GetSize()[1] - y, ren);
		UnLock();

		if (picker.GetActor() != null)
		{
			System.out.println(picker.GetActor().GetClassName());
		}
	}

	@Override
	public void keyReleased(final KeyEvent e)
	{}
}

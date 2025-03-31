package vtk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.Timer;


/**
 * Java AWT component that encapsulate vtkGenericRenderWindowInteractor, vtkPlaneWidget, vtkBoxWidget and extends
 * vtkPanel
 *
 * @see vtkPanel
 * @author Kitware
 */
public class vtkCanvas extends vtkPanel implements MouseListener, MouseMotionListener, MouseWheelListener, KeyListener
{
	private static final long				   serialVersionUID	= 1L;
	protected vtkGenericRenderWindowInteractor iren				= new vtkGenericRenderWindowInteractor();
	protected Timer							   timer			= new Timer(10, new DelayAction());
	protected int							   ctrlPressed		= 0;
	protected int							   shiftPressed		= 0;
	protected vtkPlaneWidget				   pw				= new vtkPlaneWidget();
	protected vtkBoxWidget					   bw				= new vtkBoxWidget();

	@Override
	public void Delete()
	{
		iren = null;
		pw = null;
		bw = null;
		super.Delete();
	}

	public vtkCanvas()
	{
		super();
		Initialize();
	}

	public vtkCanvas(final vtkRenderWindow renwin)
	{
		super(renwin);
		Initialize();
	}

	protected void Initialize()
	{
		iren.SetRenderWindow(rw);
		iren.TimerEventResetsTimerOff();
		iren.AddObserver("CreateTimerEvent", this, "StartTimer");
		iren.AddObserver("DestroyTimerEvent", this, "DestroyTimer");
		iren.SetSize(200, 200);
		iren.ConfigureEvent();
		pw.AddObserver("EnableEvent", this, "BeginPlaneInteraction");
		bw.AddObserver("EnableEvent", this, "BeginBoxInteraction");
		pw.SetKeyPressActivationValue('l');
		bw.SetKeyPressActivationValue('b');
		pw.SetInteractor(iren);
		bw.SetInteractor(iren);

		addComponentListener(new ComponentAdapter()
		{
			@Override
			public void componentResized(final ComponentEvent event)
			{
				// The Canvas is being resized, get the new size
				final int width = getWidth();
				final int height = getHeight();
				setSize(width, height);
			}
		});

		ren.SetBackground(0.0, 0.0, 0.0);

		// Setup same interactor style than vtkPanel
		final vtkInteractorStyleTrackballCamera style = new vtkInteractorStyleTrackballCamera();
		iren.SetInteractorStyle(style);
	}

	public void StartTimer()
	{
		if (timer.isRunning())
		{
			timer.stop();
		}

		timer.setRepeats(true);
		timer.start();
	}

	public void DestroyTimer()
	{
		if (timer.isRunning())
		{
			timer.stop();
		}
	}

	/**
	 * Replace by getRenderWindowInteractor()
	 */
	@Deprecated
	public vtkGenericRenderWindowInteractor getIren()
	{
		return iren;
	}

	public vtkGenericRenderWindowInteractor getRenderWindowInteractor()
	{
		return iren;
	}

	public void setInteractorStyle(final vtkInteractorStyle style)
	{
		iren.SetInteractorStyle(style);
	}

	public void addToPlaneWidget(final vtkProp3D prop)
	{
		pw.SetProp3D(prop);
		pw.PlaceWidget();
	}

	public void addToBoxWidget(final vtkProp3D prop)
	{
		bw.SetProp3D(prop);
		bw.PlaceWidget();
	}

	public void BeginPlaneInteraction()
	{
		System.out.println("Plane widget begin interaction");
	}

	public void BeginBoxInteraction()
	{
		System.out.println("Box widget begin interaction");
	}

	@Override
	public void setSize(final int x, final int y)
	{
		super.setSize(x, y);
		if (windowset == 1)
		{
			Lock();

			rw.SetSize(EkScaling.getScaledValueX(getWidth()), EkScaling.getScaledValueY(getHeight()));
			iren.SetSize(x, y);
			iren.ConfigureEvent();
			UnLock();
		}
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
		Lock();
		rw.SetDesiredUpdateRate(5.0);
		lastX = e.getX();
		lastY = e.getY();

		ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK ? 1 : 0;
		shiftPressed = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK ? 1 : 0;

		iren.SetEventInformationFlipY(e.getX(), e.getY(), ctrlPressed, shiftPressed, '0', 0, "0");

		if ((e.getModifiersEx() & InputEvent.BUTTON1_DOWN_MASK) == InputEvent.BUTTON1_DOWN_MASK)
		{
			iren.LeftButtonPressEvent();
		}
		else if ((e.getModifiersEx() & InputEvent.BUTTON2_DOWN_MASK) == InputEvent.BUTTON2_DOWN_MASK)
		{
			iren.MiddleButtonPressEvent();
		}
		else if ((e.getModifiersEx() & InputEvent.BUTTON3_DOWN_MASK) == InputEvent.BUTTON3_DOWN_MASK)
		{
			iren.RightButtonPressEvent();
		}
		UnLock();
	}

	@Override
	public void mouseReleased(final MouseEvent e)
	{
		Lock();
		rw.SetDesiredUpdateRate(0.01);

		ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK ? 1 : 0;
		shiftPressed = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK ? 1 : 0;

		iren.SetEventInformationFlipY(e.getX(), e.getY(), ctrlPressed, shiftPressed, '0', 0, "0");

		switch (e.getButton())
		{
		case MouseEvent.BUTTON1:
			iren.LeftButtonReleaseEvent();
			break;
		case MouseEvent.BUTTON2:
			iren.MiddleButtonReleaseEvent();
			break;
		case MouseEvent.BUTTON3:
			iren.RightButtonReleaseEvent();
			break;
		}

		UnLock();
	}

	@Override
	public void mouseEntered(final MouseEvent e)
	{
		this.requestFocus();
		iren.SetEventInformationFlipY(e.getX(), e.getY(), 0, 0, '0', 0, "0");
		iren.EnterEvent();
	}

	@Override
	public void mouseExited(final MouseEvent e)
	{
		iren.SetEventInformationFlipY(e.getX(), e.getY(), 0, 0, '0', 0, "0");
		iren.LeaveEvent();
	}

	@Override
	public void mouseMoved(final MouseEvent e)
	{
		lastX = e.getX();
		lastY = e.getY();

		ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK ? 1 : 0;
		shiftPressed = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK ? 1 : 0;

		iren.SetEventInformationFlipY(e.getX(), e.getY(), ctrlPressed, shiftPressed, '0', 0, "0");

		Lock();
		iren.MouseMoveEvent();
		UnLock();
	}

	@Override
	public void mouseDragged(final MouseEvent e)
	{
		if (ren.VisibleActorCount() == 0)
		{
			return;
		}

		ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK ? 1 : 0;
		shiftPressed = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK ? 1 : 0;

		iren.SetEventInformationFlipY(e.getX(), e.getY(), ctrlPressed, shiftPressed, '0', 0, "0");

		Lock();
		iren.MouseMoveEvent();
		UnLock();

		UpdateLight();
	}

	@Override
	public void mouseWheelMoved(final MouseWheelEvent e)
	{
		if (ren.VisibleActorCount() == 0)
		{
			return;
		}

		ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK ? 1 : 0;
		shiftPressed = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK ? 1 : 0;

		Lock();
		if (e.getWheelRotation() > 0)
		{
			iren.SetEventInformationFlipY(e.getX(), e.getY(), ctrlPressed, shiftPressed, '0', 0, "0");
			iren.MouseWheelBackwardEvent();
		}
		else if (e.getWheelRotation() < 0)
		{
			iren.SetEventInformationFlipY(e.getX(), e.getY(), ctrlPressed, shiftPressed, '0', 0, "0");
			iren.MouseWheelForwardEvent();
		}
		UnLock();

		UpdateLight();
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

		ctrlPressed = (e.getModifiersEx() & InputEvent.CTRL_DOWN_MASK) == InputEvent.CTRL_DOWN_MASK ? 1 : 0;
		shiftPressed = (e.getModifiersEx() & InputEvent.SHIFT_DOWN_MASK) == InputEvent.SHIFT_DOWN_MASK ? 1 : 0;

		iren.SetEventInformationFlipY(lastX, lastY, ctrlPressed, shiftPressed, keyChar, 0, String.valueOf(keyChar));

		Lock();
		iren.KeyPressEvent();
		iren.CharEvent();
		UnLock();
	}

	@Override
	public void keyReleased(final KeyEvent e)
	{}

	private class DelayAction implements ActionListener
	{
		@Override
		public void actionPerformed(final ActionEvent evt)
		{
			Lock();
			iren.TimerEvent();
			UpdateLight();
			UnLock();
		}
	}
}

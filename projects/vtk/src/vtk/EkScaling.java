package vtk;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;


public class EkScaling
{

	public static int getScaledValueX(final int value)
	{
		final double windowsScale = getGraphicsDevice().getDefaultConfiguration().getDefaultTransform().getScaleX();
		return (int) (windowsScale * value);
	}

	public static int getScaledValueY(final int value)
	{
		final double windowsScale = getGraphicsDevice().getDefaultConfiguration().getDefaultTransform().getScaleY();
		return (int) (windowsScale * value);
	}

	public static GraphicsDevice getGraphicsDevice()
	{
		final GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		final GraphicsDevice[] allScreens = ge.getScreenDevices();

		int screenID = 0;
		final String prop = System.getProperty("fr.ekoscan.ui.screenID");
		if (prop != null)
		{
			screenID = Integer.parseInt(prop);
		}
		final GraphicsDevice gDevice = allScreens[screenID];
		return gDevice;

	}

}

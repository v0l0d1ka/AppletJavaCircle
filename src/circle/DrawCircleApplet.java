package circle;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics; 
/*
<applet code="DrawCircleApplet.class" width=320 height=120>
<param name=rad value="50">
</applet>
*/

public class DrawCircleApplet extends Applet{
	int radiusSize=10;	// initialized to default size
	String radiusSizeParam;
	public void init () {
		radiusSizeParam = getParameter("rad");
		parseRadiusSize(radiusSizeParam);
		System.out.println(radiusSizeParam);
		setForeground(Color.yellow);   //set color to red
	}
	private void parseRadiusSize (String param)
	{
	   if (param == null) return;
	   try {
	      radiusSize = Integer.parseInt(param);
	   }
	   catch (Exception e) {
	     // Let default value remain
	   }
	}
	public void paint (Graphics g)
	   {
		
		g.fillOval(100, 20, radiusSize * 2, radiusSize * 2);
	   }
}

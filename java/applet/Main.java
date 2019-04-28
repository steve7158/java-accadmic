import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="Main" width=200 height=60>
</applet>
*/

public class Main extends Applet{
	// Overriding paint() method
    @Override
	public void paint(Graphics g){
		g.drawString("Hello World",20 ,20);
	}
}


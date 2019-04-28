/*<applet code="Main.class" width="300" height="300"></applet>*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Main extends Applet implements MouseMotionListener{

	public void init(){
		addMouseMotionListener(this);
		setBackground(Color.red);
		}
	public void mouseDragged(MouseEvent e){
		Graphics g=getGraphics();
		g.setColor(Color.white);
		g.fillRect(e.getX(),e.getY(), 5, 5);
		}
	public void mouseMoved(MouseEvent me){}
}


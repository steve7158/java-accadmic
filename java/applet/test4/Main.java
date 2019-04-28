/*
<applet code="Main.class" width="300" height="300"></applet>  
 */

import java.awt.*;
import java.applet.*;

public class Main extends Applet{
	Image picture;
	public void init(){
		picture=getImage(getDocumentBase(), "manuel.jpeg");
		}
	public void paint(Graphics g){
		g.drawImage(picture, 30, 30, this);
		}
}



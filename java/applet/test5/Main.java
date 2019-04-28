/*<applet code="Main.class" width="300" height="300">  
</applet>  
*/
import java.awt.*;
import java.applet.*;
public class Main extends Applet{
	Image picture;
	public void init(){
		picture=getImage(getDocumentBase(), "catpc.gif");
		}
	public void paint(Graphics g){
		for (int i=0;i<500;i++){
			g.drawImage(picture, i, 30, this);

			try{
				Thread.sleep(100);
			}
			catch(Exception e){
			}
		}
	}
}

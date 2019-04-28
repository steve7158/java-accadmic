/*<applet code="Main.class" width="300" height="200"></applet>*/


import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;

public class Main extends Applet implements Runnable{
	Thread t=null;
	int hour=0,minutes=0,seconds=0;
	String timeString="";

	public void init(){
		setBackground(Color.green);
		}

	public void start(){
		t=new Thread(this);
		t.start();
	}

	public void run(){
		try{
			while(true){
				Calendar cal=Calendar.getInstance();
				hour=cal.get(Calendar.HOUR_OF_DAY);
				if(hour>12){
					hour=hour-12;
				}
				minutes=cal.get(Calendar.MINUTE);
				seconds=cal.get(Calendar.SECOND);

				SimpleDateFormat formatter=new SimpleDateFormat("hh:mm:ss");
				Date date=cal.getTime();
				timeString=formatter.format(date);

				repaint();
				t.sleep(1000);
			}
		}
		catch(Exception e){}
	}
	public void paint(Graphics g){
	      	g.setColor(Color.blue);
		g.drawString(timeString, 50, 50);
		}
}

	
			       

import java.io.*;
import java.utill.*;

class Sender{
	public void send(String msg){
		System.out.println("sending the \t"+msg);
		try{
			Thread.sleep(1000);
		}
		catch(Exception e){
			System.out.println("Thread intrupted");
		}
		System.out.println(msg+"sent");
	}
}
class ThreadedSend extends Thread{
	private String msg;
	private Thread t;
	Sender sender;

	ThreadedSend(String m, sender obj){
		msg=m;
		sender=obj;
		}
	public void run(){
		synchronized(sender){
			sender.send(msg);
		}
	}
}
class syncDemo{
	public static void main(String args[]){
	       	snd=new Sender();
		ThreadedSend s1=new ThreadedSend("hi",snd);
		ThreadedSend s2=new ThreadedSend("bye", snd);

		s1.start();
		s2.start();

		try{
			s1.join();
			s2.join();
		}
		catch(Exception e){
			System.out.println("interupted");
		}	
	}
}	



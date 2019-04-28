import java.lang.*;
public class main implements Runnable{
	Thread t;
	public void run(){
		for(int i=0;i<4;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
			try{
				Thread.sleep(1000);
			}
			catch (Exception e){
				System.out.println(e);
			}
		}
	}
	public static void main(String args[]) throws Exception{
		Thread t=new Thread(new main());
		t.start();
		Thread t2=new Thread(new main());
		t2.start();
		Thread t3=new Thread(new main());
                t3.start();
		Thread t4=new Thread(new main());
                t4.start();
		Thread t5=new Thread(new main());
                t5.start();
	}
}


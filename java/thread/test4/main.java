import java.lang.*;

class main extends Thread{
	public void run(){
		System.out.println("inside the run method");
	}

	public static void main(String args[]){
		main t1= new main();
		main t2=new main();
		main t3=new main();

		System.out.println("t1 thread priority"+t1.getPriority());
		System.out.println("t2 thread priority"+t2.getPriority());
		System.out.println("t3 thread priority"+t3.getPriority());

		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		System.out.println("t1 thread priority"+t1.getPriority());
		System.out.println("t2 thread priority"+t2.getPriority());
		System.out.println("t3 thread priority"+t3.getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println("main thread priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
	}
}

interface in1{
	final int a = 10;
	default void display(){
		System.out.println("helloe world");
	}
}
class main implements in1{
	public static void main(String args[]){
		main m=new main();
		m.display();
	}
}

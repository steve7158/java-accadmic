interface PI1{
	default void show(){
		System.out.println("Default PI1");
	}
}
interface PI2{
	default void show(){
		System.out.println("default PI2");
	}
}
class Main implements PI1, PI2{
	public void show(){
		PI1.super.show();
		PI2.super.show();
	}
	public static void main(String args[]){
		Main m=new Main();
		m.show();
	}
}


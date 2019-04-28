public class second_2{
	static void method_1(){
		System.out.println("Static method is called");
	}
	public void method_2(){
		System.out.println("Public method is called");
	}

	public static void main(String[] args){
		method_1();
		second_2 obj = new second_2();
		obj.method_2();
		}
}


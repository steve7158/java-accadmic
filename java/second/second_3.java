

	class s31{
		void method_1(){
			System.out.println("This is function is called method_1 an dit is called from s31");
		}
	}
	class s32{
		void method_2(){
			System.out.println("This function is called method_2 and it is called from s32");
		}
	}

public class second_3{
	public static void main(String[] args){
		s31 obj1 = new s31();
		s32 obj2 = new s32();
		obj1.method_1();
		obj2.method_2();
	}




}


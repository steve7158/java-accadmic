class arithmatic_exept_demo{
	public int a, b;
	void exept(){
		try{
			a=30;b=2;
			int c=a/b;
			System.out.println("your answer is = "+c);
		}
		catch(ArithmeticException e){
			System.out.println("the arithmetic exception is caught here");
		}
	}
}
	
class sixth_2 extends arithmatic_exept_demo{
	public static void main(String args[]){
		arithmatic_exept_demo obj = new arithmatic_exept_demo();
		obj.exept();
			
	}
}




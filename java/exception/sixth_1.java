class q1
{
	public int b;
	void div()
	{ 
		try {
		b=3/0;
		System.out.println(" no answere there");
		}
		catch(ArithmeticException e)
		{
		System.out.println("exception caught");
		}
		finally(){
			System.out.println("this statement is execute in finally");
	}
}

class sixth_1 extends q1{
	public static void main(String args[]){
		System.out.println("main functoin starts here");
		q1 c = new q1();
		c.div();
	}
}

interface firstinterface{
	public void first();
}

interface secondinterface{
	public void second();
}

class demo implements firstinterface, secondinterface{
	public void first(){
		System.out.println("this is the method of firstinterface");
	}
	public void second(){
		System.out.println("this is the method in second inetrface");
	}
}

class eight_2{
	public static void main(String[] args){
		demo obj = new demo();
		obj.first();
		obj.second();
	}
}


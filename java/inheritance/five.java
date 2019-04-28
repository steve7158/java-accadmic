class car{
	protected String brand="Ford";
	public void honk(){
		System.out.println("tut tuuuut");
	}

}


public class five extends car{
	private  String model = "Mustang";
	public static void main(String[] args){
		five obj = new five();
		obj.honk();
		System.out.println(obj.brand+" "+obj.model);
	}
}

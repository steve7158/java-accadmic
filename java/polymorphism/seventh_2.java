interface animal{
	public void animalsound();
	public void sleep();
}

class pig implements animal{
	public void animalsound(){
		System.out.println("the pig says toot toot");
	}
	public void sleep(){
		System.out.println("zzzz");
	}

}


class seventh_2{

	public static void main(String[] args){
		pig obj=new pig();
		obj.animalsound();
		obj.sleep();

	}
}


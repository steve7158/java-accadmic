class animal{
	void animalsound(){
		System.out.println("the animal sounds are");
	}
}

class dog extends animal{
	void animalsound(){
		System.out.println("the dog says : bark, bark");
	}
}

class pig extends animal{
	void animalsound(){
		System.out.println("the dog says : tweek tweek");
	}
}



class seventh_1{

	public static void main(String[] args){
		animal obja=new animal();
		dog objd=new dog();
		pig objp=new pig();
		obja.animalsound();
		objd.animalsound();
		objp.animalsound();

	}
}


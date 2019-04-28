import java.io.*;

interface Vehicle{
	void changeGear(int a);
	void speedUp(int a);
	void applyBreak(int a);
}

class Bicycle implements Vehicle{
	int speed;
	int gear;

	public void changeGear(int newGear){
		gear=newGear;
	}
	public void speedUp(int increment){
		speed=speed+increment;
	}
	public void applyBreak(int decrement){
		speed=speed-decrement;
	}
	public void printStates(){
		System.out.println("speed: "+speed+"gear: "+gear);
	}
}
class Bike implements Vehicle{
	int speed;
	int gear;
	public void changeGear(int newGear){
		gear=newGear;
	}
	public void speedUp(int increment){
		speed=speed+increment;
	}
	public void applyBreak(int decrement){
		speed=speed-decrement;
	}
	public void printStates(){
		System.out.println("speed: "+speed+" gear: "+gear);
	}
}
class main{
	public static void main(String args[]){
		Bicycle bicycle=new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBreak(1);
		System.out.println("Bicycle present state: ");
		bicycle.printStates();
	}
}

		

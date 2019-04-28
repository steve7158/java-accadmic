class Bicycle{
  public int gear;
  public int speed;

  public Bicycle(int gear, int speed){
    this.gear=gear;
    this.speed=speed;
  }
  public void applyBreak(int decrement){
    speed=speed-decrement;
  }
  public void speedUp(int increment){
    speed=speed+increment;
  }
  public String toString(){
    return("no of gears are"+gear+"\n the speed of Bicycle"+speed);
  }
}

class MountainBike extends Bicycle{
  public int seatHeight;
  public MountainBike(int gear, int speed, int startHeight){
    super(gear, speed);
    seatHeight=startHeight;
  }
  public void seatHeight(int newValue){
    seatHeight=newValue;
  }
  public String toString(){
    return(super.toString()+"\nseat height is"+seatHeight);
  }
}

public class car{
  public static void main(String args[]){
    MountainBike mb=new MountainBike(3,100,25);
    System.out.println(mb.toString());
  }
}

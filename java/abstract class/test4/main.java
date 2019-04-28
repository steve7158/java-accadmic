abstract class Base{
  final void fun(){
    System.out.println(" the final void fun() is calle");
  }
}
class Derived extends Base{}

class main{
  public static void main(String args[]){
    Base b=new Derived();
    b.fun();
  }
}

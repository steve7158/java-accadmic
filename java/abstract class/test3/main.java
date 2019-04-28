abstract class Base{
  void fun(){
    System.out.println("void fun() is called from the base class");
  }
}

class Derived extends Base{}
class main{
  public static void main(String args[]){
    Derived d=new Derived();
    d.fun();
  }
}

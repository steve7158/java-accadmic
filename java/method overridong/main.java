class Parent{
  void show(){
    System.out.println("parents show()");
  }
}
class Child extends Parent{
  void show(){
    System.out.println("Childs show()");
  }
}
class main{
  public static void main(String args[]){
    Parent obj1=new Parent();
    Child obj2=new Child();
    Parent obj3=new Parent();
    System.out.println("parernt");
    obj1.show();
    System.out.println("parernt-child");
    obj2.show();
    System.out.println("Child");
    obj3.show();
  }
}

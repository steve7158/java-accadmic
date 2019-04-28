import java.io.*;
interface in1{
  final int a=10;
  void display();
}
class main implements in1{
  public void display(){
    System.out.println("Geeks");
  }
  public static void main(String args[]){
    main t=new main();
    t.display();
    System.out.println(a);
  }
}

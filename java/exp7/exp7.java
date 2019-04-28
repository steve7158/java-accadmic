class student{
  int rollNumber;
  void getData(int n){
    rollNumber=n;
  }
  void putNumber(){
    System.out.println("rollNumber is = "+rollNumber);
  }
}
class test extends student{
  double part1, part2;
  void getMarks(double x, double y){
    part1=x;
    part2=y;
  }
  void printMarks(double x, double y){
    System.out.println("part1= "+part1+"part2= "+part2);
  }
}
interface sports{
  double sportwt=6.0;
  void putwt();

}
class result extends test implements sports{
  public void putwt(){
    System.out.println("sports wt is"+sportwt)
  }
  void display(){
    double total=part1+part2+sportwt;
    System.out.println("total is = "+total);
  }

}

class exp7{
  public static void main(String args[]){
    int n=10;
    result obj=new result();
    double x=20.5, y=25.5;
    obj.getData(n);
    obj.putNumber();
    obj.getMarks(x,y);
    obj.printMarks();
    obj.putwt();
    obj.display();
  }
}

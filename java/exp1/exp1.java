class exp1{
  public static void main(String args[]){
    box b1=new box(2.2, 3.3, 4.4);
    b1.disp_box_details();
    System.out.println("volume="+b1.Volume());
  }
}
class box{
  double ln,bd,ht;
  box(double l, double b, double h){
    ln=l;
    bd=b;
    ht=h;

  }
  double Volume(){
    return ln*bd*ht;

  }
  void disp_box_details(){
      System.out.println("length= "+ln+"breadth = "+bd+"height= "+ht);
  }

}

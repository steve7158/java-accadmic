class Box{
  double height;
  double width;
  double breadth;
  double volume;

  Box(double h, double w, double b){
    height=h;
    width=w;
    breadth=b;
  }
  void volume(){
    volume=height*width*breadth;
    System.out.println("volume="+volume+"\n");
  }
}
class boxWeight extends Box{
  double weight;
  boxWeight(double l, double b, double w, double wt){
    super(l,w,b);
    weight=wt;
  }
}
class Shipment extends boxWeight{
  double cost;
  Shipment(double l, double b, double w, double wt, double c)
  {
    super(l,b,w,wt);
    cost=c;
  }
}
public class exp4{
  public static void main(String[] args){
    Shipment s = new Shipment(5,6,7,8,9);
    s.volume();
  }
}

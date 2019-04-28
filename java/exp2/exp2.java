class greatest{
  int x,y,z;
  greatest(int a, int b, int c){
    x=a;y=b;z=c;
  }
  int compare(){
    if(x>y&x>z){
      return x;
    }
    if(y>x&y>z){
      return y;
    }
    else{
      return z;
    }

  }
  void a(){
    int n=compare();
    System.out.println("the greatest no is="+n);
  }
}
class exp2{
  public static void main(String args[]){
    greatest g=new greatest(5,6,8);
    g.a();
  }
}

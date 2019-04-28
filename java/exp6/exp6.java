import java.util.Scanner;
public class exp6{
  public static void main(String[] args){
    int n,m=1;
    int[] a;
    a=new int[5];
    Scanner in=new Scanner(System.in);
    while(m>0){
      n=in.nextInt();
      switch(n){
        case 1:
        a[0]=a[0]+1;
        break;
        case 2:
        a[1]=a[1]+1;
        break;
        case 3:
        a[2]=a[2]+1;
        break;
        case 4:
        a[3]=a[3]+1;
        break;
        case 5:
        a[4]=a[4]+1;
        break;
        default:
        System.out.println("Spoiled");
      }
      System.out.println("Enter 1 for voting and 0 to stop voting");
      m=in.nextInt();

    }
    for(int i=0;i<5;i++){
      System.out.println("candidate"+i+"has"+a[i]+"votes");
    }
  }
}

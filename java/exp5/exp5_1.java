import java.util.Scanner;
public class exp5_1{
  public static void main(String[] args){
    int count;
    String temp;
    Scanner scan=new Scanner(System.in);
    System.out.print("enter no of strings ou would like to enter: ");
    count=scan.nextInt();

    String str[]=new String[count];
    Scanner scan2=new Scanner(System.in);
    System.out.println("enter the strings one by one: ");
    int i=0;
    // ENTER THE STRING IN ANYOREDR
    for(i=0;i<count;i++){
      str[i]=scan2.nextLine();
    }
    scan.close();
    scan2.close();
    System.out.println(i);
    for(int j=i+1; j<count; j++){
      if(str[i].compareTo(str[j])>0){
        temp=str[i];
        str[i]=str[j];
        str[j]=temp;
      }
    }
    System.out.println("strings in sorted order: ");
    for(i=0; i<=count-1; i++){
      System.out.print(str[i]+",");
    }
  }
}

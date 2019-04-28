import java.util.Scanner;
// CLASS A IS CONSTRUCTED HERE IT CONTAINS ALL WORKING FUNCTONS RELATED TO THE QUESETIONS
class A{
  String x,y;
  int z;
  void initialisation(String a, String b, int c){
    x=a;
    y=b;
    z=c;
  }
  int deposit(int a){
    z=z+a;
    System.out.println("your new amount is....="+z);
    return z;
  }
  int withdraw(int a){
    z=z-a;
    return z;
  }
  void display(int a){
    System.out.println("Depositor name"+x);
    System.out.println("Type of account is"+y);
    System.out.println("amount:"+a);
  }
}
// exp3 IS THE MAIN CLASS WHICH CONTAIN THE MAIN FUNCTION
class exp3{
  public static void main(String args[]){
    String x,y;
    int z,k,n;
    A p=new A();
    Scanner in = new Scanner(System.in);
    System.out.println("Name: ");
    x=in.nextLine();
    System.out.println("Account type:");
    y=in.nextLine();
    System.out.println("Amount: ");
    z=in.nextInt();

    p.initialisation(x,y,z);
    p.display(z);

    System.out.println("Enter 1 to deposit");
    System.out.println("Enter 2 to withdraw");
    System.out.println("Enter 3 to view info");

    n=in.nextInt();
    if(n==1){
      System.out.println("enter the amount to be deposited: ");
      k=in.nextInt();
      z=p.deposit(k);
      System.out.println("The new amount is: "+z);
    }
    else if(n==2){
      System.out.println("Enter the amount to be withdrawn: ");
      k=in.nextInt();
      if(z<k+1000){
        System.out.println("insufficient Amount");
      }
      else{
        z=p.withdraw(k);
        p.display(z);
      }
    }
    // else if(n==3){
    //   p.display(z);
    // }

    else if(n==3){
      p.display(z);
    }
    else{
      System.out.println("Wrong choice");
    }
  }
}

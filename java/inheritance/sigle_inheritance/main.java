import java.util.*;
import java.lang.*;
import java.io.*;

class one{
  public void print_geek(){
    System.out.println("Geeks for geeks");
  }
}

class two extends one{
  public void print_for(){
    System.out.println("for geeks");
  }
}

public class main{
  public static void main(String args[]){
    two g=new two();
    g.print_geek();
    g.print_for();

  }
}

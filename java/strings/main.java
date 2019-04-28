import java.io.*;
import java.util.*;
class main{
  public static void main(String args[]){
    String s="geeks for geeks";
    System.out.println("String length is="+s.length());
    System.out.println("charecter at third position="+s.charAt(3));
    System.out.println("substring= "+s.substring(3));
    System.out.println("substring= "+s.substring(2,5));
    String s1="Master";
    String s2=" Steve Jose";
    System.out.println("concatenated string= "+s1.concat(s2));
    String s4="Learn share Learn";
    System.out.println("index of share"+ s4.indexOf("Share"));
    System.out.println("index of a= "+s4.indexOf('a',3));
    Boolean out="Geeks".equals("geeks");
    System.out.println("checking equality for Geeks with geeks "+ out);
    out="Geeks".equals("Geeks");
    System.out.println("checking equality for Geeks with Geeks "+out);
    out="Geeks".equalsIgnoreCase("gEeKs");
    System.out.println("checking equality for Geeks with gEeKs "+out);
    int out1=s1.compareTo(s2);
    System.out.println("if s1=s2 "+out);
    String word1="GeeKyMe";
    System.out.println("changing to lower case"+word1.toLowerCase());
    String word2="GeekYmE";
    System.out.println("changing to UperCase"+word2.toUpperCase());
    String word4="Learn Share Learn";
    System.out.println("trim the word Learn Share Learn "+word4.trim());
    String str1="feeksforfeeks";
    System.out.println("orginal string "+str1);
    String str2="feeksforfeeks".replace('f','g');
    System.out.println("replaced f with g "+str2);

  }
}

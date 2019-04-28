import java.io.FileOutputStream;
public class Main2{
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("test_main2.txt");
			String s="welcome to java tut";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success");
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

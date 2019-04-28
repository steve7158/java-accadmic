import java.io.FileInputStream;
public class Main3{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("test_main2.txt");
			int i=fin.read();
			int j=fin.read(byte[] i);

			System.out.println((char)i);
			fin.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

package filehandling;
import java.io.*;

public class FileInputeStreamDemo {
	public static void main(String[] args) {
		
		try(FileInputStream fi=new FileInputStream("C:\\Users\\Administrator\\Desktop\\core java\\FileWriter.txt"))
		{
			int data ;
			while((data=fi.read())!=-1) {
				System.out.print((char)data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}

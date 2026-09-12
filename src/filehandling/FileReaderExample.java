package filehandling;
import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) {
		
		try {
			FileReader fr=new FileReader("C:\\Users\\Administrator\\Desktop\\core java\\demo4.txt");
			
			int ch;
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}

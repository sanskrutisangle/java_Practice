package filehandling;
import java.io.*;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		try(FileReader reader= new FileReader("data.txt")){
			int ch ;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
			
		}catch(Exception e ) {
			
		}
	}

}//filereader close automatically

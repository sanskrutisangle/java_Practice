package filehandling;
import java.io.*;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\\\Users\\\\Administrator\\\\Desktop\\\\core java\\\\demo4.txt"));
			
			writer.write("hello");
			writer.newLine();
			writer.write("hello from new line");
			 writer.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

package filehandling;
import java.io.*;

public class PrintWriterDemo {
	public static void main(String[] args) {
		try {
			PrintWriter writer=new PrintWriter("data.txt");
			writer.print("java");
			writer.printf("number %d ",5);
			writer.println("new line");
			
			 writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

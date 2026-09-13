package filehandling;
import java.io.*;

public class DeserializationExample {
	public static void main(String[] args) {
		try(FileInputStream fis =new FileInputStream("C:\\Users\\Administrator\\Desktop\\core java\\FileWriter.txt");
				ObjectInputStream ois=new ObjectInputStream (fis)){
			
			emp e=(emp)ois.readObject();
			
			System.out.println("Id : "+e.id);
			
			System.out.println("name : "+e.name);
			
			System.out.println("done ....");
			
			}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

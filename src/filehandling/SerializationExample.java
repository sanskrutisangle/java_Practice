package filehandling;
import java.io.*;


class emp implements Serializable{
	int id;
	String name;
	
	public emp(int id,String name) {
		this.id=id;
		this.name=name;
	}
}

public class SerializationExample {
	public static void main(String[] args) throws IOException{
		emp e=new emp(101,"sanskruti");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\core java\\FileWriter.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		fos.close();
		oos.close();
		System.out.println("done ");
		
	}

}

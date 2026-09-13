package filehandling;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		try(FileOutputStream fo =new FileOutputStream("data.txt")){
			String txt="hellooo sanskruti";
			//fo.write("helooo");//FileOutputStream writes data to the file as bytes. so it can not accept data in form of string
			
			fo.write(txt.getBytes());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}

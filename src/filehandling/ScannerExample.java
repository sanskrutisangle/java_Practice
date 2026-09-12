package filehandling;
import java.util.*;
import java.io.*;

public class ScannerExample {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(new File("data.txt"));
			String data=sc.nextLine();
			System.out.println(data);
			sc.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}

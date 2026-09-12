package filehandling;
import java.io.*;
public class demo {
	public static void main(String[] args) {
		
//		for(int i=0;i<5;i++) {
//			File file=new File("C:\\Users\\Administrator\\Desktop\\core java\\demo"+i+".txt");
//			
//			try {
//				if(file.createNewFile()) {
//					System.out.println("file create");
//				}else {
//					System.out.println("file already exit");
//				}
//			}catch(IOException e) {
//				System.out.println(e.getMessage());
//			}
//		}

			File file=new File("C:\\Users\\Administrator\\Desktop\\core java\\demo.txt");
			
			try {
				if(file.createNewFile()) {
					System.out.println("file create");
				}else {
					System.out.println("file already exit");
				}
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}	
		
		System.out.println(file.exists());
	}

}

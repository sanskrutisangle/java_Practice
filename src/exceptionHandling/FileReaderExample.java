package exceptionHandling;

public class FileReaderExample {
	static void readFile() throws Exception{
		 throw new Exception("File not found");
	}
	
	public static void main(String[] args) {
		try {
			readFile();
			
		}catch(Exception e ){//"If an Exception occurs in the try block, catch that exception and store it in variable e."
			 System.out.println(e.getMessage());
		}
	}

}
//getMessage() gets the message that was given when the exception was created.
package exceptionHandling;

class InvalidMarksException extends Exception{
	public InvalidMarksException(String msg) {
		super(msg);
	}
	
}
public class MarksValidation {
	public static void main(String[] args) {
		try {
			int mark=90;
			if(mark<0) {
				throw new InvalidMarksException("mark cannot negative ");
			}
			if(mark>100) {
				throw new InvalidMarksException("mark cannot greater than 100 ");
			}
			System.out.println("you achive "+mark +" mark in you exam ");
		}catch(InvalidMarksException e) {
			System.out.println("error found : "+e.getMessage());
		}
		
		
	}
}

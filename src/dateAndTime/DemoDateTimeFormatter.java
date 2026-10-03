package dateAndTime;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DemoDateTimeFormatter {
	public static void main(String[] args) {
		
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd:MM:yyyy");
		DateTimeFormatter dateTime=DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:MM");
		
		LocalDate today=LocalDate.now();
		
		String result =today.format(date);
		
		System.out.println(result);
		
		LocalDateTime d1=LocalDateTime.now();
		String result1=d1.format(dateTime);
		System.out.println(result1);
		
		
		String value = "03-10-2026"; //parse()=string to obj  and DateTimeFormatter= obj to String 
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate mydate =LocalDate.parse(value, formatter);//After parsing, mydate is a LocalDate object. When you print a LocalDate, its default toString() format is:
		System.out.println(mydate);
		
		//parse = read and convert text into a structured value.
		//DateTimeFormatter tells Java the format/pattern of a date or time.
		
	}

}

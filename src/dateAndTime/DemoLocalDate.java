package dateAndTime;
import java.time.*;

public class DemoLocalDate {
	public static void main(String[] args) {
		
		//today
		LocalDate today=LocalDate.now();
		System.out.println("today "+today);
		
		
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfWeek());
		
		System.out.println("leap year or not : "+today.isLeapYear());
		
		//custom date 
		LocalDate custom=LocalDate.of(2026, 10, 2);
		System.out.println("custom date "+custom);
		
		//Adding and subtracting dates
		
		LocalDate date=LocalDate.of(2006, 9, 8);
		System.out.println(date.plusDays(2));
		System.out.println(date.plusWeeks(1));
		System.out.println(date.plusMonths(12));
		System.out.println(date.plusYears(10));
		
		System.out.println(date.minusDays(5));
		System.out.println(date.minusWeeks(2));
		System.out.println(date.minusMonths(3));
		System.out.println(date.minusYears(1));
		
		
		LocalDate d1 =
		        LocalDate.of(2026, 10, 3);

		LocalDate d2 =
		        LocalDate.of(2026, 10, 10);
		
		System.out.println(d2.isAfter(d1));
		System.out.println(d1.isBefore(d2));
		System.out.println(d1.isEqual(d2));
		
		
		
		
	}

}

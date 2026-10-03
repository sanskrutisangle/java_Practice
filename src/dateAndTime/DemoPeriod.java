package dateAndTime;
import java.time.*;

public class DemoPeriod {
	 public static void main(String[] args) {
		
		 LocalDate start=LocalDate.of(2006,9, 8);
		 LocalDate end=LocalDate.now();
		 
		 Period result=Period.between(start, end);
		 System.out.println(result);
		 System.out.println(result.getYears());
		 System.out.println(result.getMonths());
		 System.out.println(result.getDays());
		 
		 
	}

}

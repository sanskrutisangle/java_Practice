package dateAndTime;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DemoChronoUnit {
	public static void main(String[] args) {
		LocalDate start =
		        LocalDate.of(2026, 10, 1);

		LocalDate end =
		        LocalDate.of(2026, 10, 10);
		
		long result=ChronoUnit.DAYS.between(start, end);
		System.out.println(result);
		
	}

}

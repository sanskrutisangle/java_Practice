package dateAndTime;
import java.time.*;

public class DemoZonedDateTime {
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		ZonedDateTime dateTime = ZonedDateTime.now(zone);
		System.out.println(dateTime);
		
	}

}

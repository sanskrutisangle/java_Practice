package dateAndTime;

import java.time.LocalDateTime;

public class DemoLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		LocalDateTime dt =
		        LocalDateTime.of(
		            2026,
		            10,
		            3,
		            10,
		            30
		        );
		System.out.println(dt);
		
	}

}

package dateAndTime;

import java.time.LocalTime;

public class DemoLocalTime {
	public static void main(String[] args) {
		
		//now 
		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		//custom time 
		LocalTime custom=LocalTime.of(10,2);
		System.out.println(custom);
		
		
		//methods 
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.getNano());
		
		//Adding and subtracting time
		
		System.out.println(time.plusHours(2));
		System.out.println(time.plusMinutes(30));
		System.out.println(time.plusSeconds(20));
		
		System.out.println(time.minusHours(1));
		System.out.println(time.minusMinutes(8));
		System.out.println(time.minusSeconds(2));
	}

}

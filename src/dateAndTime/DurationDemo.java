package dateAndTime;
import java.time.*;

public class DurationDemo {
	public static void main(String[] args)  {
		
		LocalDateTime d1=LocalDateTime.now();
//		int sum=0;
//		for(int i=0;i>=1000000000;i++) {
//			sum+=i;
//		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
			
		LocalDateTime d2=LocalDateTime.now();
		
		Duration result=Duration.between(d1, d2);
		System.out.println(result);
	}

}

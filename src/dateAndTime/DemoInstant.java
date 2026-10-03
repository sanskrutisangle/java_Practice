package dateAndTime;
import java.time.*;

public class DemoInstant {

	public static void main(String[] args) {
		long d1=System.currentTimeMillis();
		System.out.println(d1);
		
		Instant i1=Instant.now();//This represents an exact point on the global timeline.
		System.out.println(i1);
	}
}

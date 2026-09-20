package enumDemo;

enum TrafficLight{
	RED, YELLOW, GREEN;
}
public class TrafficLightEnum {
	public static void main(String[] args) {
		TrafficLight value =TrafficLight.RED;
		
		switch(value) {
		case RED :
			System.out.println("stop");
			break;
		case YELLOW :
			System.out.println("Wait");
			break;
		case GREEN : 
			System.out.println("GREEN");
			break;
		
		}
		
	}

}

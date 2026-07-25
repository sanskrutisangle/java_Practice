package polymorphism;

public class DowncastingDemo {
	public static void main(String[] args) {
		Notification n = new EmailNotification();
		EmailNotification n1=(EmailNotification)n;
		n1.sendMessage();
	}

}

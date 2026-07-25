package polymorphism;
class Notification{
	void sendMessage() {
        System.out.println("Sending notification...");
    }
}
class  EmailNotification extends Notification{
	@Override
	void sendMessage() {
		System.out.println("Sending Email notification...");
	}
}
class SMSNotification extends Notification{
	@Override 
	void sendMessage() {
		System.out.println("Sending SMS notification...");
	}
}
public class MethodOverridingDemo {
	public static void main(String[] args) {
		EmailNotification obj1=new EmailNotification();
				
		SMSNotification  obj2=new SMSNotification();
		obj1.sendMessage();
		obj2.sendMessage();
		
	}

}

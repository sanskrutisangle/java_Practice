package polymorphism;

public class ArrayPolymorphismDemo {
	public static void main(String[] args) {
		Notification[] Notification= {
				new EmailNotification(),
				new SMSNotification()
		};
		for(Notification n:Notification) {
			n.sendMessage();
		}
		
	}

}

/*
 Polymorphism with arrays means creating an array of the parent class type and storing objects of different child classes in it.
*/
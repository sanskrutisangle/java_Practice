package polymorphism;

public class DynamicMethodDispatchDemo {

    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
       
        n1.sendMessage();
        n2.sendMessage();
       
    }
}



package interfaceEx;
@FunctionalInterface
interface Greeting {
    void sayHello();
}
class  Demo implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
public class FunctionalInterfaceEx {
	public static void main(String[] args) {
        Greeting g = new Demo();
        g.sayHello();
    }
}

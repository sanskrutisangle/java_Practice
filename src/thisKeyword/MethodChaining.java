package thisKeyword;
 
class car{
	String name;
	double price;
	 car setname(String name) {
		 this.name=name;
		 return this;
	 }
	 
	 car setprice(double price) {
	 this.price=price;
	 return this;
	 }
	 
	 car display() {
		 System.out.println("name of the car : "+name);
		 System.out.println("price of the car : "+price);
		 return this;
	 	}
	 
	 }


public class MethodChaining {
	public static void main(String[] args) {
		car c=new car();
		c.setname("safari").setprice(9000000.98).display();

	}
}

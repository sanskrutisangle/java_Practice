package thisKeyword;

class Mobile{
	String brand;
	double price;
	
	Mobile(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	Mobile getmobile() {
		return this;
	}
	void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
    }
}

public class MobileMain {
	public static void main(String[] args) {
		 Mobile m1 = new Mobile("Samsung", 25000);
		 Mobile m2=m1.getmobile();
		m2.display();
	}

}

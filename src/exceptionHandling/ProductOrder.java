package exceptionHandling;

class InvalidQuantityException extends Exception{
	public InvalidQuantityException(String msg) {
		super(msg);
	}
}
public class ProductOrder {
	public static void main(String[] args) {
		int quantity=5;
		try {
			if(quantity == 0) {
				throw new InvalidQuantityException("quantity cannot 0");
			}
			if(quantity<0) {
				throw new InvalidQuantityException("quantity cannot less than 0");
			}
			System.out.println("you order "+ quantity + " items");
		}catch(InvalidQuantityException e) {
			System.out.println(e.getMessage());
		}
	}
}

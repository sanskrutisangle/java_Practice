package inherits;

class Customer{
	int customerId ;
	String customerName ;
	
	Customer(int customerId,String customerName){
		this.customerId =customerId;
		this.customerName= customerName;
	}
	void displayCustomer() {
		System.out.println("customer ID : "+customerId);
		System.out.println("customer Name : "+customerName);
	}
}
class Order extends Customer{
	int orderId;
	String productName;
	
	Order(int customerId,String customerName,int orderId,String productName){
		super(customerId,customerName);
		this.orderId=orderId;
		this.productName=productName;
	}
	void displayOrder(){
		System.out.println("order Id : "+orderId);
		System.out.println("product Name : "+productName);
		
	}
}
class DeliveredOrder extends Order{
	String deliveryDate;
	String deliveryStatus;
	DeliveredOrder (int customerId,String customerName,int orderId,String productName,String deliveryDate,String deliveryStatus){
		super(customerId,customerName,orderId,productName);
		this.deliveryDate=deliveryDate;
		this.deliveryStatus=deliveryStatus;
	}
	void  displayDelivery() {
		System.out.println("delivery Date : "+deliveryDate);
		System.out.println("delivery Status : "+deliveryStatus);
	}
}
public class ShoppingSystem {
	public static void main() {
		DeliveredOrder obj=new DeliveredOrder(101,
				"sanskruti sangale",
				98,
				"Wireless Mouse",
				"22 june 2026",
				"Delivered"
				);
	
		obj.displayCustomer();
		obj.displayOrder();
		obj.displayDelivery();
		
		}

}

package enumDemo;

enum PaymentStatus{
	SUCCESS(200 ,"Payment successful"),
	PENDING(100 ," Payment pending"),
	FAILED(400 ," Payment failed");
	
	private int statusCode;
	private String message;
	
	PaymentStatus(int statusCode, String message){
		this.statusCode=statusCode;
		this.message=message;
	}
	
	public int getstatusCode() {
		return statusCode;
	}
	
	public String getmessage() {
		return message;
	}
	
	
}

public class PaymentStatusData {
	public static void main(String[] args) {
		PaymentStatus e = PaymentStatus.SUCCESS;
		
		System.out.println("stuts : "+ e);
		System.out.println("status Code : "+e.getstatusCode() );
		System.out.println("message : "+e.getmessage());
	}

}

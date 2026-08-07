package encapsulation;
class CustomerInfo{
	private int id;
	private  String name;
	private String email;
	private  int phone;
	
	CustomerInfo(){
		
	}
	
	public void setid(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public void setphone(int phone) {
		this.phone=phone;
	}
	
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public int getphone() {
		return phone;
	}
	
}
public class Customer {
	public static void main(String[] args) {
		CustomerInfo obj=new CustomerInfo();
		obj.setid(101);
		obj.setname("sanskruti");
		obj.setemail("sanskruti@gmail.com");
		obj.setphone(1234567890);
		 System.out.println("Customer ID : " + obj.getid());
	     System.out.println("Customer Name : " + obj.getname());
	     System.out.println("Email : " + obj.getemail());
	     System.out.println("Phone : " + obj.getphone());
		
	}

}

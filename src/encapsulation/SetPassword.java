package encapsulation;
class Password {
	private String password;
	public void setpass(String password) {
		this.password=password;
	}
}
public class SetPassword {
	public static void main(String[] args) {
		Password p=new Password();
		//Write-only object
		p.setpass("sanskruti@123");
	
	}
}

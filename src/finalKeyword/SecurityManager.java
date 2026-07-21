package finalKeyword;

public class SecurityManager {
	final int OG_PIN=8899;
	final void verifyPIN(int pin) {
		if(OG_PIN==pin) {
			System.out.println("PIN Verified ");
		}else {
			System.out.println("Invalid PIN");
		}
	}
}

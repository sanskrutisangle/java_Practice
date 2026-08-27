package exceptionHandling;

class InvalidUsernameException extends Exception{
	public InvalidUsernameException (String msg){
		super(msg);
	}
}
class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String msg){
		super(msg);
	}
		

}

public class LoginSystem {
	static void login(String username ,String password) throws InvalidUsernameException ,InvalidPasswordException
	{
		
		
		if(username.length()<5) {
			throw new InvalidUsernameException("Username must be at least 5 characters.");
		}
		if(password.length()<8) {
			throw new InvalidPasswordException("Password must be at least 8 characters.");
		}
		
		System.out.println("your have a good passwords ");
	}
	public static void main(String[] args) {
		
		try {
			login("sank","12345678");
		}catch(InvalidUsernameException e){
			System.out.println(e.getMessage());
		}
		catch(InvalidPasswordException e){
					System.out.println(e.getMessage());
				}
	}
}

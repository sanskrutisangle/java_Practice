package association;
class Passport {
	int passportNumber;
	Passport(int passportNumber){
		
		this.passportNumber=passportNumber;
	}
	
}
class  Person{
	String name;
	int passportNumber;
	Passport passport;
	Person(String name,Passport passport){
		this.name=name;
		this.passport=passport;
		}
	 void display() {
	        System.out.println("Person Name: " + name);
	        System.out.println("Passport Number: "+passport.passportNumber);
	 }
	
}
public class OnetoOne {
	public static void main(String[] args) {
		Passport  passport=new  Passport(2900000);
		Person person = new Person("sanskruti",passport);
		person.display();
		
	}

}

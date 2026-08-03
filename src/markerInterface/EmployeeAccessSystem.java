package markerInterface;

interface VIPAccessEx{
	
}
class Employee{
	void showDetails() {
        System.out.println("employee");
    }
}
class Manager extends Employee implements VIPAccessEx {

    @Override
    void showDetails() {
        System.out.println("Manager");
    }
}


class AccessChecker{
	public static void check(Employee emp) {
		emp.showDetails();
		if(emp instanceof VIPAccessEx){
            System.out.println("VIP Access Granted");
        } else {
            System.out.println("Normal Access");
        }
	}
}
public class EmployeeAccessSystem {
	 public static void main(String[] args) {
		 Employee e = new Employee();
	        Manager m = new Manager();
	        
	        AccessChecker.check(e);
	        AccessChecker.check(m);
	        
	 }

	

}

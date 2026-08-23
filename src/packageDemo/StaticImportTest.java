package packageDemo;

import packageDemo.CompanyDetails;
import packageDemo.EmployeeDetails;

public class StaticImportTest {
	public static void main(String[] args) {
		// System.out.println(x); this give error bcz Static import ambiguity.
		
		//instead we do this to access the variable of two different class of same name  using class name 
		System.out.println(CompanyDetails.x);
		System.out.println(EmployeeDetails.x);
	}

}

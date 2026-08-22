package packageDemo;

public class defaultMem {
	//Access a default member from the same package
	public static void main(String[] args) {
		MyInfo obj=new MyInfo();
		System.out.println(obj.marks);
		//System.out.println(obj.mark); can not access private member 
	}

}

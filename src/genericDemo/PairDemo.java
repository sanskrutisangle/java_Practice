package genericDemo;

class Pair<T,E>{
	T empId;
	E name;
	
	public Pair(T empId,E name){
		this.empId=empId;
		this.name=name;
	}
	
	void display(){
		System.out.println(empId);
		System.out.println(name);
	}
}

public class PairDemo {
	public static void main(String[] args) {
		Pair <Integer,String>obj1=new Pair<>(101,"sakshi");
		obj1.display();
	}

}

package genericDemo;

//Generic interface
interface Calculator<T> {

 T add(T a, T b);
}

//Class implementing Calculator with Integer
class IntegerCalculator implements Calculator<Integer> {

 @Override
 public Integer add(Integer a, Integer b) {
     return a + b;
 }
}

class DoubleCalculator implements Calculator<Double>{
	 @Override
	 public Double add(Double a,Double b) {
		 return a+b;
	 }
	
}
public class CalculatorDemo {
	public static void main(String[] args) {
		IntegerCalculator obj1=new IntegerCalculator();
		System.out.println(obj1.add(1,1));
		DoubleCalculator obj2=new DoubleCalculator();
		System.out.println(obj2.add(1.0,2.8));
		
	}

}

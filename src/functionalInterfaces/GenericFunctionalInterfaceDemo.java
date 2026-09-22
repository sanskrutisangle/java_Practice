package functionalInterfaces;

@FunctionalInterface

interface Processor<T, R>{
	T process(R value);
}

public class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {
		Processor<Integer,Integer> task1=a->a*a;
		System.out.println(task1.process(78));
		
		Processor<String , String> task2=word->word.toLowerCase();
		System.out.println(task2.process("JAVA"));
	}

}

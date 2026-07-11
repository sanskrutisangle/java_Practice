package decisionMakingStatements;

public class ElseIfEx {
	public static void main(String[] args) {
		
		int mark=89;
		
		if(mark>=90) {
			System.out.println("grade A");			
		}else if(mark>=75) {
			System.out.println("grade B");
			
		}else if(mark>=60) {
			System.out.println("grade C");
			
		}else {
			System.out.print("you are pass");
		}
	}

}

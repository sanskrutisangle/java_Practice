package loopingStatements;

public class PrintOddNumbers {
	public static void main(String[] args) {
		/*int n=15;
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i=i+2;
		}*/
		int n=10;
		int i=1;
		while(i<=n) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}

}

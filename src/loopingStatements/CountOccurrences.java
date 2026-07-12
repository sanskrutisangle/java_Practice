package loopingStatements;

import java.util.Scanner;

public class CountOccurrences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to search : ");
		int search=sc.nextInt();
		int count =0;

        int[] arr = {10, 20,20, 30,10, 40, 50,10};
        for(int num:arr) {
        	if(num==search) {
        		count ++;
        	}
        }
        System.out.print(search+" is appears "+count+" times");
        sc.close();
	}

}

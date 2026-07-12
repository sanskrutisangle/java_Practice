package loopingStatements;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("enter the Element that you want to fint :");
        int target = sc.nextInt();
        boolean found=false;
        for(int i:arr) {
        	if(i==target) {
        		found=true;
        		break;
        	}
        }
        if(found) {
    		System.out.println("Element  Found");
    	}else {
    		System.out.print("Element Not Found");
    	}
        sc.close();
        
	}

}

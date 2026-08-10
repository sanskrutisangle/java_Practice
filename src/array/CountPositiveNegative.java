package array;

public class CountPositiveNegative {
	public static void main(String[] args) {

        int[] arr = {10, 15, 20, -25, 30, -35};
        int pos=0;
        int neg=0;
        
        for(int i :arr) {
        	if(i>=0) {
        		pos++;
        	}else {
        		neg++;
        	}
        }
        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
	}

}

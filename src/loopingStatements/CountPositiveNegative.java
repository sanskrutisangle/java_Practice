package loopingStatements;

public class CountPositiveNegative {
	public static void main(String[] args) {

        int[] arr = {10, -5, 20, -15, 0, 30, -25};
        int positive=0;
        int negative=0;
        int zero=0;
        for(int num:arr) {
        	if(num>0) {
        		
        		positive ++;
        	}else if(num<0){
        		
        		negative ++;
        	}else {
        		zero ++;
        	}
        		
        }
        System.out.println("positive number : "+positive);
        System.out.println("negative number : "+negative);
        System.out.println("number of zeroes : "+zero);
        
        
	}
}

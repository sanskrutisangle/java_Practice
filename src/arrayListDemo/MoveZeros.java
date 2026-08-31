package arrayListDemo;

import java.util.ArrayList;

public class MoveZeros {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(10);
        numbers.add(0);
        numbers.add(20);
        numbers.add(30);
        numbers.add(0);
        numbers.add(40);

        ArrayList<Integer> result = new ArrayList<>();
        int zeroCount = 0;

        for (int i = 0; i < numbers.size(); i++) {
        	int num=numbers.get(i);
        	
        	if(num==0) {
        		zeroCount++;
        	}else {
        		result.add(num);
        	}
        }
        
        for(int i=0;i<zeroCount;i++) {
        	result.add(0);
        }
        System.out.println(result);
	}

}

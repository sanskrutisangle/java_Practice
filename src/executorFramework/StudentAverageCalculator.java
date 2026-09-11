package executorFramework;
import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

public class StudentAverageCalculator {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);

        String[] names = {"Rahul", "Sneha", "Amit", "Priya"};

        int[][] marks = {
            {80, 75, 90},
            {70, 85, 80},
            {90, 88, 95},
            {75, 82, 78}
        };
        
        List<Future<Double>> results=new ArrayList<>();
        
        for(int i=0;i<names.length;i++){
        	
        	String studentName=names[i];
        	int[] mark=marks[i];
        	
        	Callable<Double> task=()->{
        		int total=0;
        		for(int n:mark) {
        			total+=n;
        		}
        		return (double)total/mark.length;
        	};
        	
        	Future<Double> future=executor.submit(task);
        	results.add(future);
        }
	for(int i=0;i<results.size();i++) {
		try {
			double avg=results.get(i).get();
			 System.out.println(
	                    names[i] + " → " + avg
	                );
		}catch(Exception e) {
			System.out.println("Exception occurred");
		}
	}
	executor.shutdown();
	}
}

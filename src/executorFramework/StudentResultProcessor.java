package executorFramework;
import java.util.concurrent.*;

public class StudentResultProcessor {
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		int[][] student= {
				{87,67,78},
				{89,99,76},
				{98,67,77},
				{78,89,66},
				{81,90,76},
				{67,77,78}
		};
		for(int i=0;i<student.length;i++) {
			int studentNumber =i+1;
			
			
			int[] mark=student[i];
			
			executor.submit(()->{
				int total = 0;

                for (int num : mark) {
                    total += num;
                }
                
                System.out.println(
                		 "student Number : "+studentNumber+
                         " total mark : "+total+
                         " task execute by : "+Thread.currentThread().getName());
               
				
			});
			
			
			
		}
		executor.shutdown();
	}

}

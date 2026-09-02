package LinkedList;

import java.util.LinkedList;

public class LinkedListSum {
	public static void main(String[] args) {
LinkedList<Integer> list=new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int sum=0;
		
		for(int i=0;i<list.size();i++) {
			sum=sum+list.get(i);
		}
		/*
		
		for(int num : list) {
			sum=+num;
		}*/
		System.out.println(sum);
	}

}

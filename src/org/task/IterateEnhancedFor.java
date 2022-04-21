package org.task;

import java.util.ArrayList;
import java.util.List;

public class IterateEnhancedFor {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(75);
		System.out.println(li);
		System.out.println("Iteration Using Enhanced For loop");
		for(int x:li) {
			System.out.println(x);
		}
}
}
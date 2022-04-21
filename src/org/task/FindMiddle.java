package org.task;

import java.util.ArrayList;
import java.util.List;

public class FindMiddle {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(75);
		System.out.println(li);
		for(int i=0; i<=li.size(); i++) {
		}
	int middle=li.size()/2;
	int middleValue=li.get(middle);
	System.out.println(middleValue);
}
}
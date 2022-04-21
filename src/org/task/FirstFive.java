package org.task;

import java.util.LinkedList;
import java.util.List;

public class FirstFive {
	public static void main(String[] args) {
		List<Integer> li=new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(75);
		li.add(84);
		li.add(74);
		li.add(14);
		li.add(65);
		System.out.println(li);
		for (int i=0; i<5; i++) {
			int firstFive=li.get(i);
			System.out.println(firstFive);
		}
	}	
	}		


package org.task;

import java.util.ArrayList;
import java.util.List;

public class AlternateNumber {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(10);
		li.add(75);
		System.out.println(li);
		for(int i=0; i<li.size(); i=i+2) {
			int alternate=li.get(i);
			System.out.println(alternate);
		}
}
}
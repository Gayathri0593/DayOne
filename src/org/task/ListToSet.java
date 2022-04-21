package org.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ListToSet {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(10);
	System.out.println("Before Addall"+li);
	Set<Integer> si=new HashSet<>();
	si.addAll(li);
	System.out.println("After addAll"+si);
}
}

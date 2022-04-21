package org.task;

import java.util.ArrayList;
import java.util.List;

public class LastIndexValue {
public static void main(String[] args) {
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(10);
	System.out.println(li);
	int last=li.get(li.size()-1);
	System.out.println(last);
}
}

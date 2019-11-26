package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestD {
public static void main(String[] args) {
	Comparator<Integer> cmp = (m1,m2)->{
		if(m1>m2)
			return 1;
		else if (m1<m2) {
			return -1;
		}
		return 0;
	};
	ArrayList<Integer> marks = new ArrayList<Integer>();
	marks.add(80);
	marks.add(85);
	marks.add(75);
	marks.add(64);
	long l= marks.stream().filter(i->i>35).count();
	System.out.println("Number of failed Student "+l);
	System.out.println("------------------------");
	Integer i = marks.stream().max(cmp).get();
	System.out.println("Max Value "+i);
	System.out.println("------------------------");
	Integer j = marks.stream().min(cmp).get();
	System.out.println("Min Value "+j);
}
}

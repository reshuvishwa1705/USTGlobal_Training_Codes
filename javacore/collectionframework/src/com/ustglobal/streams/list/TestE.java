package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(20);
	al.add(25);
	al.add(35);
	al.add(54);
	al.add(11);
	List<Integer> l= al.stream().sorted().collect(Collectors.toList());
Iterator<Integer> it = l.iterator();
System.out.println("sorted element are");
while (it.hasNext()) {
	Integer i = (Integer) it.next();
	System.out.println(i);
	System.out.println("--------------------");
	
}
}
}

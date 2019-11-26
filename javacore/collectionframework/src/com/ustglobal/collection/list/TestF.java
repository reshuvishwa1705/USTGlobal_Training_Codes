package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestF {
public static void main(String[] args) {
	ArrayList<Double> al = new ArrayList<Double>();
	al.add(29.65);
	al.add(null);
	al.add(36.55);
	al.add(45.00);
	al.add(45.00);
	System.out.println(al);
	al.add(3,25.00);
	System.out.println("After using add(index,object) method "+al);
	al.remove(null);
	System.out.println("After using remove() method "+al);
	al.remove(4);
	System.out.println("After using remove(index) method "+al);
	Double d = al.get(3);
	System.out.println("After using get() method "+d);
	al.set(3,12.25);
	System.out.println("After using set() method "+al);
	al.clear();
	System.out.println("After using clear() method "+al);
	al.contains(25.00);
	List<Double> l = new ArrayList<Double>();
	l.add(22.1);
	l.add(56.23);
	l.add(56.12);
	l.addAll(al);
	System.out.println("After using addAll() method "+l);
	System.out.println("After using contains() method "+l.contains(22.1));
	System.out.println("After using removeAll() method "+l.removeAll(l));
	System.out.println("After using containsAll() method "+l.containsAll(al));
	System.out.println(l);



	
}
}

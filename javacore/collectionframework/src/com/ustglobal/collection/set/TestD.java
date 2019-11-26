package com.ustglobal.collection.set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
	ls.add(24.36);
	ls.add(85.66);
	ls.add(56.12);
	ls.add(48.23);
	System.out.println("********USING FOR EACH LOOP************");
	for (Object obj : ls) {
		System.out.println(obj);
	}
Iterator it = ls.iterator();
	System.out.println("********USING FOR ITERATOR************");
	while (it.hasNext()) {
		Object obj = (Object) it.next();
		System.out.println(obj);
		
	}
}
}

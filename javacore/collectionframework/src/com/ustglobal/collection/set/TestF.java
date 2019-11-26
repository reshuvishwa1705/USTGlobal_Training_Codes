package com.ustglobal.collection.set;
import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("x");
	ts.add("u");
	ts.add("w");
	ts.add("o");
	System.out.println("********USING FOR EACH LOOP************");
	for (Object obj : ts) {
		System.out.println(obj);
	}
Iterator it = ts.iterator();
	System.out.println("********USING FOR ITERATOR************");
	while (it.hasNext()) {
		Object obj = (Object) it.next();
		System.out.println(obj);
		
	}
}
}

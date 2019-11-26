package com.ustglobal.collection.set;
import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
public static void main(String[] args) {
	TreeSet ts = new TreeSet();
	ts.add(67);
	ts.add(65);
	ts.add(565);
	ts.add(22);
	ts.add(66);
//	ts.add("njfn"); you can add only single type of data it will give CLASSCASTEXCEPTION
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

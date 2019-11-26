package com.ustglobal.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(12.67);
		hs.add("Deepa");
		hs.add('a');
		hs.add(12);
		hs.add(null);
		//	hs.add(null); u cant add two null value only one value can accepted

		System.out.println("********USING FOR EACH LOOP************");
		for (Object obj : hs) {
			System.out.println(obj);
		}
		Iterator it = hs.iterator();
		System.out.println("********USING FOR ITERATOR************");
		while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);

		}
	}
}

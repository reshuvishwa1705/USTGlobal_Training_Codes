package com.ustglobal.collection.set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(55);
		ls.add(15.02);
		ls.add("Pippa");
		ls.add('a');
		ls.add(null);
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

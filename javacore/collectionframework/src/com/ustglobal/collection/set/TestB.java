package com.ustglobal.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Crysis");
		hs.add("HornetAshish");
		hs.add("King Jay");
		hs.add("Hydra prayans");
		hs.add("Dev Rathore");
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

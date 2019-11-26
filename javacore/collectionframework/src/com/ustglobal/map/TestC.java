package com.ustglobal.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
	lhm.put("Banglore", 454564);
	lhm.put("Mumbai", 545455);
	lhm.put("Pune", 132136);
	lhm.put("Bhopal", 464240);
	lhm.put("Indore", 451002);
	System.out.println(lhm);
	System.out.println("----------------------");
	System.out.println("Keys are...");
	Set<String> s = lhm.keySet();
	Iterator<String> it = s.iterator();
	while (it.hasNext()) {
		String key = (String) it.next();
		System.out.println(key);
		
	}
	System.out.println("----------------------");
	System.out.println("Values are...");
	Collection<Integer> c = lhm.values();
	for(int v : c) {
		System.out.println(v);
	}
	System.out.println("----------------------");
}
}

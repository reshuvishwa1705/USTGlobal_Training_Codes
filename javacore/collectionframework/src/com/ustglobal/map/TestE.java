package com.ustglobal.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TestE {
public static void main(String[] args) {
	TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
	tm.put("Banglore", 454564);
	tm.put("Mumbai", 545455);
	tm.put("Pune", 132136);
	tm.put("Bhopal", 464240);
	tm.put("Indore", 451002);
	for(Entry<String, Integer> e : tm.entrySet()) {
		String s = e.getKey();
		Integer i = e.getValue();
		System.out.println("Key is "+s+", Value is "+i);
		System.out.println("-----------------");
	}
}
}

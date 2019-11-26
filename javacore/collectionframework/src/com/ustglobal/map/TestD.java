package com.ustglobal.map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestD {
public static void main(String[] args) {
	LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
	lhm.put("Banglore", 454564);
	lhm.put("Mumbai", 545455);
	lhm.put("Pune", 132136);
	lhm.put("Bhopal", 464240);
	lhm.put("Indore", 451002);
	for(Entry<String, Integer> e: lhm.entrySet()) {
		System.out.println("Key is "+e.getKey());
		System.out.println("Value is "+e.getValue());
		System.out.println("----------------");
	}
	
}
}

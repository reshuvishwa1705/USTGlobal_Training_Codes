package com.ustglobal.map;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put("kuku",1145465);
	hm.put("mala",4545415);
	hm.put("bala",9795455);
	hm.put("kiku",1215112);
	HashMap hm1 = new HashMap();
	hm.put("deepa",1155133);
	hm.put("deepu",4415213);
	hm.put("deepika",9726535);
	hm.put("riya",8748541);
	boolean b1 = hm.containsKey("deepu");
	System.out.println("Has Key "+b1);
	System.out.println("----------------------");
	boolean b2 = hm.containsValue(54654564);
	System.out.println("Has Value "+b2);
	System.out.println("----------------------");
	hm.putAll(hm1);
	System.out.println("After using putAll() method "+hm);
	System.out.println("----------------------");
	System.out.println("Size of map is "+hm1.size());
	System.out.println("----------------------");
	boolean b3 = hm.isEmpty();
	System.out.println("Map is empty "+b3);
	System.out.println("----------------------");
	hm.clear();
	System.out.println("After clear "+hm);
	System.out.println("-----------END-----------");	
	
}
}

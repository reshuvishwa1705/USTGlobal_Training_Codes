package com.ustglobal.map;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku",1145465);
		hm.put("mala",4545415);
		hm.put("bala",9795455);
		hm.put("kiku",1215112);
		System.out.println("Data is "+hm);
		System.out.println("------------------");
		hm.put("kuku",1147465);
		System.out.println("After added duplicate key "+hm);
		System.out.println("------------------");
		hm.put("puku",1145465);
		System.out.println("After added duplicate value "+hm);
		System.out.println("------------------");
		hm.put(null,1145465);
		System.out.println("After added null value "+hm);
		System.out.println("------------------");
		hm.put(null,87876541);
		System.out.println("After added duplicate null key "+hm);
		System.out.println("------------------");
		System.out.println("Get value by get method "+hm.get("puku"));
		System.out.println("------------------");
		System.out.println("Get value by get method "+hm.get("puu"));
		System.out.println("------------------");
		System.out.println("Get value by get method "+hm.remove("bala"));
	}
}

package com.ustglobal.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestD {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(20);
		v.add(21.90);
		v.add("Stingy");
		v.add(true);
		v.add(null);
		System.out.println("------------By For Each Loop-----------");
		for(Object v1:v) {
			System.out.println(v1);
		}
		System.out.println("---------By For Loop----------");
		for(int i=0;i<v.size();i++) {
			Object obj=v.get(i);
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator---------");
		Iterator it=v.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator using for loop---------");
		Iterator it1=v.iterator();
		for(;it1.hasNext();) {
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("-----------By ListIterator---------");
		System.out.println("==========Forward==========");
		ListIterator li = v.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("===========Backward===========");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}

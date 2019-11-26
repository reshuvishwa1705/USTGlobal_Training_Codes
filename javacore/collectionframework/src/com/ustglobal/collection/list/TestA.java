package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestA {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(21);
		al.add('s');
		al.add(10.23);
		al.add("rinku");
		al.add(null);
		al.add(true);
		System.out.println("------------By For Each Loop-----------");
		for(Object al1:al) {
			System.out.println(al1);
		}
		System.out.println("---------By For Loop----------");
		for(int i=0;i<al.size();i++) {
			Object obj=al.get(i);
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator---------");
		Iterator it=al.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator using for loop---------");
		Iterator it1=al.iterator();
		for(;it1.hasNext();) {
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("-----------By ListIterator---------");
		System.out.println("==========Forward==========");
		ListIterator li = al.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("===========Backward===========");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		Object o = al.get(3);
//		o.toUpperCase(); we have to downcast because parent 
//		reference can access onle parent specific method,when we want 
//		to access child specific method so u have to downcast
		String name = (String)o;
		System.out.println("Name is "+name);
		name=name.toUpperCase();
		System.out.println("Name is "+name);
	}
}

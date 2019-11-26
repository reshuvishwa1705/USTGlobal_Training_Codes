package com.ustglobal.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestC {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(12);
		ll.add(true);
		ll.add('A');
		ll.add("STicky");
		ll.add(22.03);
		ll.add(null);
		System.out.println("------------By For Each Loop-----------");
		for(Object ll1:ll) {
			System.out.println(ll1);
		}
		System.out.println("---------By For Loop----------");
		for(int i=0;i<ll.size();i++) {
			Object obj=ll.get(i);
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator---------");
		Iterator it=ll.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		System.out.println("-----------By Iterator using for loop---------");
		Iterator it1=ll.iterator();
		for(;it1.hasNext();) {
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("-----------By ListIterator---------");
		System.out.println("==========Forward==========");
		ListIterator li = ll.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("===========Backward===========");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}

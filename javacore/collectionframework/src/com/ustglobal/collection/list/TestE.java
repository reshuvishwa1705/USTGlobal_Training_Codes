package com.ustglobal.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestE {
public static void main(String[] args) {
	Stack s=new Stack();
	s.add(60);
	s.add(21.02);
	s.add(null);
	s.add(true);
	s.add("Tricky");
	System.out.println("------------By For Each Loop-----------");
	for(Object s1:s) {
		System.out.println(s1);
	}
	System.out.println("---------By For Loop----------");
	for(int i=0;i<s.size();i++) {
		Object obj=s.get(i);
		System.out.println(obj);
	}
	System.out.println("-----------By Iterator---------");
	Iterator it=s.iterator();
	while (it.hasNext()) {
		Object obj=it.next();
		System.out.println(obj);
	}
	System.out.println("-----------By Iterator using for loop---------");
	Iterator it1=s.iterator();
	for(;it1.hasNext();) {
		Object o=it1.next();
		System.out.println(o);
	}
	System.out.println("-----------By ListIterator---------");
	System.out.println("==========Forward==========");
	ListIterator li = s.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}
	System.out.println("===========Backward===========");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
}
}

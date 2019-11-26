package com.ustglobal.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestB {
	public static void main(String[] args) {
ArrayList<String> al = new ArrayList<String>();
al.add("Reshu");
al.add("Ranu");
al.add("Manisha");
al.add("Anushka");
al.add("Priyanka");
System.out.println(al.get(0));
System.out.println("-------By for each---------");
for(String s:al) {
	System.out.println(s);
}
System.out.println("---------By Iterator--------");
Iterator<String> it=al.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
System.out.println("----------By ListIterator----------");
ListIterator<String>li = al.listIterator();
while (li.hasNext()) {
	String str =  li.next();
	System.out.println(str);
}
	}
}
 
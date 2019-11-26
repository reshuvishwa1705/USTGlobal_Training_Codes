package com.ustglobal.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestPen {
public static void main(String[] args) {
	Pen p1 = new Pen(30,"Pentel");
	Pen p2 = new Pen(40,"Montec");
	Pen p3 = new Pen(30,"Raynolds");
	Pen p4 = new Pen(20,"Cello");
	LinkedList<Pen> ll = new LinkedList<Pen>();
	ll.add(p3);
	ll.add(p4);
	ll.add(p1);
	ll.add(p2);
	displayPenDetails(ll);
	Pen p5 = new Pen(25, "Flair","Blue");
	Pen p6 = new Pen(35, "Flair","Black");
	Pen p7 = new Pen(25, "Flair","Red");
	ArrayList<Pen> al = new ArrayList<Pen>();
	al.add(p6);
	al.add(p7);
	al.add(p5);
	Collections.sort(al);
	
}
static void displayPenDetails(LinkedList<Pen>ll) {
	Iterator<Pen> it = ll.iterator();
	while(it.hasNext()) {
		Pen p = it.next();
		System.out.println("Brand is "+p.brand);
		System.out.println("Price is "+p.price);
	}
}
}

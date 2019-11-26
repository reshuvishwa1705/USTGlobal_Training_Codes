package com.ustglobal.collection.sorting;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLaptop {
public static void main(String[] args) {
	LinkedList<Laptop> ll = new LinkedList<Laptop>();
	Laptop l1 = new Laptop("Asus", 50000.23, 4);
	Laptop l2 = new Laptop("Lenevo", 52000.12, 8);
	Laptop l3 = new Laptop("hp", 54000.236,2);
	Laptop l4 = new Laptop("Dell", 58000.69,16);
	ll.add(l3);
	ll.add(l2);
	ll.add(l4);
	ll.add(l1);
	displayLaptopDetails(ll);
	Collections.sort(ll);
}
static void displayLaptopDetails(LinkedList<Laptop> ll) {
	Iterator<Laptop> it = ll.iterator();
	while(it.hasNext()) {
		Laptop l = it.next();
		System.out.println("Name is "+l.name);
		System.out.println("Price is "+l.price);
		System.out.println("RAM is "+l.RAM);
		System.out.println("-----------------------------");
	}
}
}

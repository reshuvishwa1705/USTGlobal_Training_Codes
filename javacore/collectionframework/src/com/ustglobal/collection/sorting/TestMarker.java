package com.ustglobal.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50, "Black"));
		al.add(new Marker(55, "Blue"));
		al.add( new Marker(45, "Red"));
		al.add(new Marker(54, "Green"));
		System.out.println("Before Sorting-------------");
		display(al);
		MarkerSortByPrice sb = new MarkerSortByPrice();
		Collections.sort(al,sb);
		System.out.println("After Sorting-------------");
		display(al);
		MarkerSortByColor msc = new MarkerSortByColor();
		System.out.println("Sorted By Color--------");
		Collections.sort(al,msc);
		display(al);


	}
	static void display(ArrayList<Marker> al) {
		Iterator<Marker> it = al.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is "+m.price);
			System.out.println("Color is "+m.clr);
			System.out.println("---------------");
		}
	}
}

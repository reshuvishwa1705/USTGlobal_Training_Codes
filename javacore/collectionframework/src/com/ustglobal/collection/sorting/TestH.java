package com.ustglobal.collection.sorting;

import java.util.Collections;
import java.util.LinkedList;

public class TestH {
public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(12);
	ll.add(13);
	ll.add(12);
	ll.add(55);
	ll.add(56);
	System.out.println("Before Sorting "+ll);
	Collections.sort(ll);
	System.out.println("After Sorting "+ll);
	Collections.reverse(ll);
	System.out.println("After Using reverse() "+ll);
	Collections.shuffle(ll);
	System.out.println("After Using shuffle() "+ll);

}
}

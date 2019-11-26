package com.ustglobal.collection.sorting;
import java.util.ArrayList;
import java.util.Collections;

public class TestG {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("QA");
	al.add("B");
	al.add("M");
	al.add("C");
	System.out.println("Before Sorting "+al);
	Collections.sort(al);
	System.out.println("After Sorting "+al);
}
}

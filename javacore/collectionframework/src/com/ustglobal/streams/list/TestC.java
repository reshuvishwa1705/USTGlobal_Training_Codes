package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(20);
	al.add(25);
	al.add(35);
	al.add(54);
	List<Integer> l= al.stream().map(i->i+50).collect(Collectors.toList());
	System.out.println("After adding 50 in each number");
	for (Integer i : l) {
		System.out.println(i);
	}
}
}

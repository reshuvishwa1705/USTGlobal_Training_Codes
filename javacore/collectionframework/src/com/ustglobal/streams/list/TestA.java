package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(25);
		al.add(35);
		al.add(54);
		List<Integer> l= al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l);
	}
}

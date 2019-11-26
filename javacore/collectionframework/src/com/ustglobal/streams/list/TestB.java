package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestB {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(2);
	al.add(5);
	al.add(3);
	al.add(4);
	List<Integer> l= al.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(l);
}
}

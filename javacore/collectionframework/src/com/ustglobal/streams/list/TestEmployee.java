package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
public static void main(String[] args) {
	ArrayList<Employee> al = new ArrayList<Employee>();
	Employee e1 = new Employee(101, "A");
	Employee e2 = new Employee(102, "B");
	Employee e3 = new Employee(103, "C");
	al.add(e2);
	al.add(e3);
	al.add(e1);
	Comparator<Employee> cmp = (o1,o2)->{
		Integer i = o1.id;
		Integer j = o2.id;
		return i.compareTo(j);
	};
	List<Employee> l = al.stream().sorted(cmp).collect(Collectors.toList());
for (Employee e : l) {
	System.out.println("Id is "+e.id);
	System.out.println("Name is "+e.name);
	System.out.println("------------------");
}
}
}

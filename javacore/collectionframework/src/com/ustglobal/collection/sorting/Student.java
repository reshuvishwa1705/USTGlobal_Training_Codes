package com.ustglobal.collection.sorting;

public class Student implements Comparable<Student>{
	int id;
	String name;
	double per;
	public Student(int id, String name, double per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.id<o.id) {
//			return -1;
//		}
//		else if(this.id>o.id) {
//			return 1;
//		}
//		else
//			return 0;
//	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.per<o.per) {
//			return -1;
//		}
//		else if(this.per>o.per) {
//			return 1;
//		}
//		else
//			return 0;
//	}
//	@Override
//	public int compareTo(Student o) {
//		String s1 = this.name.toLowerCase();
//		String s2 = o.name.toUpperCase();
//			return s1.compareTo(s2);
//	}
	@Override
	public int compareTo(Student o) {
		Integer i = this.id;
		Integer j = o.id;
		return i.compareTo(j);
	}
}

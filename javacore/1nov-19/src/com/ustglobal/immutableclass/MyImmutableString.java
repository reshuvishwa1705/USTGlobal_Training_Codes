package com.ustglobal.immutableclass;

public final class MyImmutableString {
private final int rollno;
private final String name;
public MyImmutableString(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public String getName() {
	return name;
}
public final MyImmutableString changeContent(int rollno,String name) {
	return new MyImmutableString(rollno, name);
}
}

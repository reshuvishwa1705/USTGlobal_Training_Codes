package com.ustglobal.thread.properties;

public class MyThread extends Thread{
public static void main(String[] args) {
	System.out.println("Main Started");
	String tname = Thread.currentThread().getName();
	System.out.println("Current thread "+tname);
	Thread.currentThread().setName("ANnu");
    String cname = Thread.currentThread().getName();
	System.out.println("Current thread "+cname);
	MyThread mt = new MyThread();
	String mname = mt.getName();
	System.out.println("MyThread default name "+mname);
	 mt.setName("Guldu");
	 String mname1 = mt.getName();
	System.out.println("MyThread name "+mname1);
	System.out.println(10/0);
	System.out.println("Main Ended");
}
}

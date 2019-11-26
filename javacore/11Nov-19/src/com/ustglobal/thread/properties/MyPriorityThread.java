package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{
public static void main(String[] args) {
	System.out.println("Main Started");
	int p = Thread.currentThread().getPriority();
	System.out.println("main thread priority "+p);
	Thread.currentThread().setPriority(MIN_PRIORITY);
	int p1 = Thread.currentThread().getPriority();
	System.out.println("main thread priority after setting priority  "+p1);
	MyPriorityThread mpt = new MyPriorityThread();
	int q = mpt.getPriority();
	System.out.println("MyPriority thread priority "+q);
	mpt.setPriority(6);
	int q1 = mpt.getPriority();
	System.out.println("MyPriority thread priority "+q1);
	Thread t1 = new Thread();
	System.out.println("Thread t1 id is "+t1.getId());
//	ti.setPriority(20); IllegalArgumentException
	System.out.println("Main Ended");
	
}
}

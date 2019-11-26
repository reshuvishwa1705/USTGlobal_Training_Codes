package com.ustglobal.thread;

public class Test {
public static void main(String[] args) {
	System.out.println("Main started");
	MyThread mt = new MyThread();
	mt.start();
		/*
		 * dont call run method directly by object mt.run(); it behave like normal program 
		 * all code will be executed inside main thread only
		 */
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}
	System.out.println("Main ended");
}
}
;
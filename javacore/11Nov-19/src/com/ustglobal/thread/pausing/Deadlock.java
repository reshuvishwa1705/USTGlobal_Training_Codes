package com.ustglobal.thread.pausing;

public class Deadlock {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Runnable r1 = ()->{
			synchronized (o1) {
				System.out.println("t1 started");
				System.out.println("t1 has locked o1");
				try {
					o1.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("t1 has locked o2");
				}
			}
			System.out.println("t1 finished");
		};
		Runnable r2 = ()->{
			synchronized (o2) {
				System.out.println("t2 started");
				System.out.println("t2 has locked o2");

				synchronized (o1) {
					System.out.println("t2 has locked o1");
					o1.notifyAll();
				}
			}
			System.out.println("t2 finished");
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
}

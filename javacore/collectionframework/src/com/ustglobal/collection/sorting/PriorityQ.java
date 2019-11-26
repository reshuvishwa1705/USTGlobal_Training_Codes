package com.ustglobal.collection.sorting;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.ustglobal.collection.set.Customer;

public class PriorityQ {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	pq.add(12);
	pq.add(24);
//	pq.add(null); priority queue does not accept null
	pq.offer(26);
	pq.add(12);
	Iterator it = pq.iterator();
	System.out.println("********USING FOR ITERATOR************");
	while (it.hasNext()) {
		System.out.println(pq.poll());
		System.out.println("---------------------");
	}
System.out.println("After poll "+pq);
}
}

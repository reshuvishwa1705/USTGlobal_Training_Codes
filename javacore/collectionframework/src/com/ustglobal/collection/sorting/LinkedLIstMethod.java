package com.ustglobal.collection.sorting;

import java.util.LinkedList;

public class LinkedLIstMethod {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(23);
		ll.add(33);
		ll.add(11);
		ll.add(67);
		System.out.println("Peek Element "+ll.peek());
		System.out.println("Peek First Element "+ll.peekFirst());
		System.out.println("Peek Last Element "+ll.peekLast());
		ll.poll();
		System.out.println("After Poll "+ll);
		System.out.println("Poll first element "+ll.pollFirst());
		System.out.println("After PollFirst "+ll);
		System.out.println("Poll last element "+ll.pollLast());
		System.out.println("After PollLast "+ll);
		ll.push(66);
		System.out.println("After Pushing element "+ll);
		ll.poll();
		System.out.println("After Poping element "+ll);
	}
}

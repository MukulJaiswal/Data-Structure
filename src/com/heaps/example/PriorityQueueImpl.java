package com.heaps.example;

import java.util.PriorityQueue;;

public class PriorityQueueImpl {
	public static void main(String[] args) {

		/**
		 * By default PriorityQueue is Minheap. That is lowest value has highest
		 * priority and so on.
		 */
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(43);
		pq.add(12);
		pq.add(32);
		pq.add(65);
		pq.add(87);
		pq.add(49);
		pq.add(45);
		pq.add(1);

		// peek() returns the root element without deleting it.
		System.out.println(pq.peek());

		Object[] list = pq.toArray();
		for (Object obj : list)
			System.out.println(obj);

	}
}

package com.heaps.example;

class MaxHeap {
	private int theHeap[];
	private int capacity;
	private int pos;

	public MaxHeap() {
		pos = 1;
		capacity = 10;
		theHeap = new int[capacity];

	}

	public void insert(int value) {
		if (pos == capacity) {
			// increase the capacity
		} else {
			theHeap[pos++] = value;
			int child = pos - 1;
			int parent = child / 2;

			while (theHeap[parent] < theHeap[child] && parent > 0) {
				int tmp = theHeap[parent];
				theHeap[parent] = theHeap[child];
				theHeap[child] = tmp;

				child = parent;
				parent = child / 2;

			}
		}
	}

	public void print() {
		// head position is below pos/2 only. Others are leaf nodes.
		for (int i = 1; i < pos / 2; i++) {
			System.out.print(" PARENT : " + theHeap[i] + " LEFT CHILD : " + theHeap[2 * i] + " RIGHT CHILD :"
					+ theHeap[2 * i + 1]);
			System.out.println();
		}
	}

}

public class MaxHeapImpl {
	public static void main(String[] args) {
		MaxHeap maxHeap = new MaxHeap();
		maxHeap.insert(5);
		maxHeap.insert(3);
		maxHeap.insert(17);
		maxHeap.insert(10);
		maxHeap.insert(84);
		maxHeap.insert(19);
		maxHeap.insert(6);
		maxHeap.insert(22);
		maxHeap.insert(9);

		maxHeap.print();
	}
}

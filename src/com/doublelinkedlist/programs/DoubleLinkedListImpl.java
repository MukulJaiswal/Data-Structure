package com.doublelinkedlist.programs;

class Node {
	int data;
	Node next;
	Node prev;
}

class DoubleLinkedList {
	Node head;

	void insertStart(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;

		node.next = head;
		node.prev = null;

		// In Double LL we always have to check for next Node
		// bacause if it doesn't exist then there is no prev of that.
		if (head != null)
			head.prev = node;
		head = node;
	}

	public void insertAt(Node n, int data) {
		Node node = new Node();

		node.data = data;
		node.next = null;
		node.prev = null;

		node.next = n.next;
		n.next = node;
		node.prev = n;

		// In Double LL we always have to check for next Node
		// because if it doesn't exist then there is no prev of that.
		if (node.next != null)
			node.next.prev = node;
	}

	public void print() {

		Node last = null;
		Node node = head;

		// Traversal in forward direction
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		// Traversal in backward direction
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}
}

public class DoubleLinkedListImpl {
	public static void main(String[] args) {

		DoubleLinkedList list = new DoubleLinkedList();
		list.insertStart(100);
		list.insertStart(200);
		list.insertStart(300);
		list.insertStart(400);

		list.print();
	}
}

package com.linkedlist.programs;

/**
 * Insert, Delete and print from a linked list.
 */
import java.util.Scanner;

/**
 * date:23/10/2018
 * 
 * @author Mukul
 *
 */
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	/**
	 * 
	 * @param data
	 */
	public void insertAtLast(int data) {

		// node that we want to add
		Node node = new Node(data);

		if (head == null)
			head = node;
		else {
			Node n = head;
			while (n.next != null) {  //n.next gives the last node.
				n = n.next;
			}
			n.next = node;
		}
	}

	/**
	 * Insert after data = value eg: insert after node having data value of 100.
	 * 
	 * @param data
	 * @param      value:Value after which value is to be added
	 */

	public void insertAt(int data, int value) {

		// Node that we want to add
		Node node = new Node(data);

		Node n = head;
		while (n.data != value) {
			n = n.next;
		}
		node.next = n.next; // Reference of n.next will be moved to node.next.
		n.next = node;
	}

	/**
	 * Insert At nth position
	 * 
	 * @param index
	 * @param data
	 */
	public void insertAtIndex(int index, int data) {

		Node node = new Node(data);

		if (index == 0)
			insertAtStart(data);
		else {
			Node n = head;
			for (int i = 0; i < index - 1; i++)
				n = n.next;
			node.next = n.next;
			n.next = node;
		}
	}

	/**
	 * 
	 * @param data
	 */
	public void insertAtStart(int data) {

		// Node which is to be inserted.
		Node node = new Node(data);

		node.next = head;
		head = node; // Bringing head again to the very first node.
	}

	/**
	 * Delete a node of given index
	 * 
	 * @param index
	 */
	public void deleteAt(int index) {

		if (index == 0) {
			head = head.next;
		} else {
			Node n = head;
			Node del = null; // Node which is to be deleted
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			del = n.next; // Holds node which is to be deleted.
			n.next = del.next;
			del = null;
		}
	}

	public void deleteLast() {

		Node n = head;
		// n.next.next will give the last second node of the linkedlist
		while (n.next.next != null) {
			n = n.next;
		}
		n.next = null;
	}

	public void deletefirst() {

		Node n = head;
		// n.next.next will give the last second node of the linkedlist
		head = head.next;
	}

	/**
	 * Printing of a linked list
	 */
	public void print() {

		Node node = head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	/**
	 * Function to reverse a linked list.
	 */
	public void reverse() {

		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
	}

	/**
	 * Function to print middle element.
	 */
	public void middelElement1() {

		Node n = head;
		int count = 0;
		while (n.next != null) {
			n = n.next;
			count = count + 1;
		}
		count = count + 1;
		n = head;
		for (int i = 0; i < count / 2; i++) {
			n = n.next;
		}
		System.out.println(n.data);
	}

	/**
	 * Function to find middle element in just a one loop.
	 */
	public void middleElement2() {

		Node fast = head;
		Node slow = head;

		// For every one increase in slow, we increase 2 step in fast.That means at end,
		// we have
		// slow to contain middle value.
		// for Odd length LL,we had use fast != null.
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}

}

public class LinkedListImpl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;

		LinkedList list = new LinkedList();
		do {
			System.out.println("Enter the value to insert:");
			int val = sc.nextInt();

			list.insertAtLast(val);

			System.out.println("Do you want to add more numbers:");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

		list.print();

		System.out.println();

	}
}

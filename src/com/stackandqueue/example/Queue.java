/**
	 * Operations Performed.....
	 * Initialize 
	 * Empty
	 * Full 
	 * Push 
	 * Pop
	 * print
*/
package com.stackandqueue.example;

import java.util.Scanner;

/**
 * 
 * @author Mukul
 *
 */
public class Queue {

	int data[];
	int front;
	int rear;
	int size;

	Queue(int size) {
		this.size = size;
		data = new int[size];
		front = -1;
		rear = -1;
	}

	int isEmpty() {
		if (rear == -1)
			return 1;
		else
			return -1;
	}

	int isFull() {
		if (rear == size - 1)
			return 1;
		else
			return -1;
	}

	void insert(int x) {
		if (rear == size - 1) {
			System.out.println("Queue is full.");
		} else if (rear == -1) {
			front = 0;
			rear = 0;
			data[rear] = x;
		} else {
			rear = rear + 1;
			data[rear] = x;
		}
	}

	int delete() {
		int x = data[front];
		if (front == rear)
			System.out.println("Queue is empty.");
		else
			front = front + 1;

		return x;
	}

	void print() {
		if (isEmpty() == 1)
			System.out.println("Queue is Empty");
		else {
			for (int i = front; i <= rear; i++) {
				System.out.print(data[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Queue:");
		int size = sc.nextInt();
		Queue ob = new Queue(size);
		char choice;

		do {

			System.out.println("Enter the operation that you want to perform:\n 1.Insert\n 2.Delete\n 3.Print");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the element that you want to Insert:");
				int x = sc.nextInt();
				ob.insert(x);
				break;
			case 2:
				int del = ob.delete();
				System.out.println(del + " is deleted.");
				break;
			case 3:
				ob.print();
				break;
			default:
				System.out.println("Wrong Choice");
				break;
			}
			System.out.println("Enter Y for Continue and N to exit:");
			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');
	}
}

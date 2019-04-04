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
public class Stack {

	int data[];
	int top;
	int size;

	Stack(int size) {
		this.size = size;
		data = new int[size];
		top = -1;
	}

	int isEmpty() {
		if (top == -1)
			return 1;
		else
			return 0;
	}

	int isFull() {
		if (top == size - 1)
			return 1;
		else
			return 0;
	}

	void push(int x) {

		if (top == size - 1) // we can use isFull() function also.
			System.out.println("Stack is Full.");
		else {
			top = top + 1;
			data[top] = x;
		}
	}

	int pop() {
		int x = 0;
		if (top == -1) {
			System.out.println("Stack is empty.");
			System.exit(0);
		}

		else {
			x = data[top];
			top = top - 1;
		}
		return x;
	}

	void print() {
		if (size == 0)
			System.out.println("Stack is Empty");
		else {
			for (int i = size - 1; i >= 0 ; i--) {
				System.out.println(data[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of stack:");
		int size = sc.nextInt();
		Stack ob = new Stack(size);
		char choice;

		do {

			System.out.println("Enter the operation that you want to perform:\n 1.Push\n 2.Pop\n 3.Print");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the element that you want to push:");
				int x = sc.nextInt();
				ob.push(x);
				break;
			case 2:
				int del = ob.pop();
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

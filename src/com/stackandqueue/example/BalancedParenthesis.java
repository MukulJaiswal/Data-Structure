package com.stackandqueue.example;

import java.util.Scanner;
import java.util.Stack;

/**
 * Checking for balanced parenthesis using stack
 * 
 * @author Mukul
 *
 */
public class BalancedParenthesis {

	static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		while (n-- != 0) {
			String s = sc.next();

			Stack<Character> stack = new Stack<Character>();

			for (int i = 0; i < s.length(); i++) {

				char ch = s.charAt(i);
				if (ch == '(' || ch == '{' || ch == '[') {
					System.out.println(ch);
					stack.push(ch);
				}
				if (ch == ')' || ch == '}' || ch == ']') {

					try {
						if (isMatchingPair(stack.peek(), ch))
						{
							System.out.println(ch);
							stack.pop();
						}else {
							System.out.println("Not balanced");
							return;
						}
				
					} catch (Exception e) {
						System.out.println("not balanced");
						System.exit(0);
					}
				}
			}
			if (stack.isEmpty())
				System.out.println("Balanced");
			else
				System.out.println("Not balanced");
		}
	}

}

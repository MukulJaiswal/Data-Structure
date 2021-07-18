package com.Treetraversal.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 25/10/2018
 * 
 * @author Mukul
 *
 */
class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class Treetraversal {

	Node root;

	Treetraversal() {
		root = null;
	}

	/**
	 * 
	 * @param root
	 * @param value
	 * @return
	 */
	Node insertElement(Node root, int value) {

		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.data)
			root.left = insertElement(root.left, value);
		else
			root.right = insertElement(root.right, value);

		return root;
	}

	void insert(int value) {
		root = insertElement(root, value);
	}

	public boolean get(Node root, int value) {

		boolean val;
		if (value == root.data)
			return true;
		if (value < root.data) {
			val = get(root.left, value);
		}
		if (value > root.data)
			val = get(root.right, value);

		return false;

	}
	
	void get(int value) {
		get(root,value);
	}

//------------------------------------Traversing-----------------------------
	/**
	 * 
	 * @param node
	 */
	public void preorder(Node node) {

		if (node == null)
			return;
		System.out.print(node.data + " ");
		preorder(node.left);
		preorder(node.right);

	}

	void preorder() {
		preorder(root);
	}

	public void inorder(Node node) {

//		6
//	4		7
//3		5		8
		
//		if (node == null)
//			return;
//		inorder(node.left);
//		System.out.print(node.data + " ");
//		inorder(node.right);
		
		//Iteration Method -- DFS Approach
        List<Integer> list = new ArrayList<Integer>();
        Stack<Node> stack = new Stack<Node>();
         
        while(!stack.isEmpty() || node != null){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            
            node = stack.pop();
            System.out.print(node.data + " ** " );
            node = node.right;
        }
    
	}

	void inorder() {
		inorder(root);
	}

	public void postorder(Node node) {

		if (node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data + " ");
	}

	void postorder() {
		postorder(root);
	}
}

public class TreetraversalImpl {
	public static void main(String[] args) {

		Treetraversal tree = new Treetraversal();

		tree.insert(6);
		tree.insert(4);
		tree.insert(7);
		tree.insert(3);
		tree.insert(5);
		tree.insert(8);
		//tree.insert(80);
		
		//tree.get(20);
		System.out.println();

		System.out.println("Preorder traversal of binary tree is");
		tree.preorder();
		System.out.println("\nInorder traversal of binary tree is ");
		tree.inorder();
		System.out.println("\nPostorder traversal of binary tree is");
		tree.postorder();
	}
}


//		6
//	4		7
//3		5		8
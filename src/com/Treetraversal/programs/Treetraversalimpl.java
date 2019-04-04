package com.Treetraversal.programs;

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

	public void preorder(Node node) {

		if (node == null)
			return;
		System.out.println(node.data + " ");
		preorder(node.left);
		preorder(node.right);

	}

	public void inorder(Node node) {

		if (node == null)
			return;
		inorder(node.left);
		System.out.println(node.data + " ");
		inorder(node.right);
	}

	public void postorder(Node node) {

		if (node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.println(node.data + " ");
	}

	void preorder() {
		preorder(root);
	}

	void inorder() {
		inorder(root);
	}

	void postorder() {
		postorder(root);
	}
}

public class Treetraversalimpl {
	public static void main(String[] args) {
		Treetraversal tree = new Treetraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.preorder();
		System.out.println("Inorder traversal of binary tree is ");
		tree.inorder();
		System.out.println("Postorder traversal of binary tree is ");
		tree.postorder();
	}
}

package com.example.demo;

public class BinaryTreeTest {

	Node root;

	void insert(int data) {
		root = insert(root, data);
	}

	public Node insert(Node current, int data) {
		if (null == current) {
			current = new Node(data);
		} else {
			if (data <= current.data  ) {
				if (null == current.left) {
					current.left = new Node(data);
				} else {
					current.left = insert(current.left, data);
				}
			} else {
				if (null == current.right) {
					current.right = new Node(data);
				} else {
					current.right = insert(current.right, data);
				}

			}
		}
		return current;
	}
	
	
	public void inorder(Node current) {
		// root->left-> right
		System.out.print(current.data+"==>");
		if (current.left != null) {
			inorder(current.left);
		}  if (current.right != null) {
			inorder(current.right);
		}

	}
	
	public void preOrder(Node current) {
		// left-> root ->right
		if (current.left != null) {
			preOrder(current.left);
		}
		System.out.print(current.data+"==>");
		if (current.right != null) {
			preOrder(current.right);
		}

	}
	public void postOrder(Node current) {
		//right-> left -> root
		if (current.right != null) {
			postOrder(current.right);
		}
		if (current.left != null) {
			postOrder(current.left);
		}
		System.out.print(current.data+"==>");
		
		
	}
	

	public class Node {
		int data;

		Node(int data) {
			this.data = data;
		}

		Node left, right;
	}

	public static void main(String[] args) {
		BinaryTreeTest binaryTree = new BinaryTreeTest();
		binaryTree.insert(10);
		binaryTree.insert(5);
		binaryTree.insert(18);
		
		binaryTree.insert(3);
		binaryTree.insert(7);
		
		binaryTree.insert(20);
		binaryTree.insert(15);
		System.out.println(binaryTree.root);
		System.out.println("PreOrder");
		binaryTree.preOrder(binaryTree.root);
		System.out.println();
		System.out.println(" InOrder");
		System.out.println();
		binaryTree.inorder(binaryTree.root);
		System.out.println();
		System.out.println(" PostOrder");
		System.out.println();
		binaryTree.postOrder(binaryTree.root);
	}

}

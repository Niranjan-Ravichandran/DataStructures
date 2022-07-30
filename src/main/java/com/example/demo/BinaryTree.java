package com.example.demo;

import lombok.ToString;

@ToString
public class BinaryTree {
	Node root;

	public void insert(int value) {
		root = insert(root, value);
	}

	private Node insert(Node current, int data) {
		if (current == null) {
			current = new Node(data);
		} else if (data <= current.data) {
			if (null == current.left) {
				current.left = new Node(data);
			} else {
				current.left = insert(current.left, data);
			}
		} else {
			if (null == current.right) {
				current.right = new Node(data);
			} else {
				current.right=insert(current.right, data);
			}

		}
		return current;
	}
	
	public boolean contains(int value) {
		return contains(root, value);
	}
	
	private boolean contains(Node current, int value) {
		boolean isContains = false;
		if(null == current ) {
			return false;
		}
		if(value == current.data) {
			return true;
		}
		if(value<=current.data) {
			return contains(current.left,value);
		}else if(value>current.data){
			return contains(current.right,value);
		}
		return isContains;
	}

	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}
	 public void displayData(Node node)  
	    {  
	      System.out.print(node.data+ " ");  
	    }  
	 // left -> right -> root
	 public void postOrder() {
		 postOrder(root);
	 }
	 private void postOrder(Node node) {
		 if(null != node) {
				postOrder(node.left);
				postOrder(node.right);
				displayData(node);
			}
	 }
	 private void preOrder() {
		 preOrder(root);
	 }
	// root -> left -> right 
	public void preOrder(Node node) {
		if(null != node) {
			displayData(node);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	 
	 private void inOrder() {
		 inOrder(root);
	 }
	 // left -> root -> right
	  public void inOrder(Node node)  
	  {  
	    if(node != null)  
	    {  
	      inOrder(node.left);  
	      displayData(node);  
	      inOrder(node.right);  
	    }  
	  }  

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(10);
		binaryTree.insert(5);
		binaryTree.insert(18);
		
		binaryTree.insert(3);
		binaryTree.insert(7);
		
		binaryTree.insert(20);
		binaryTree.insert(15);
		//System.out.println(binaryTree.contains(18));
		binaryTree.inOrder();
		System.out.println();
		binaryTree.preOrder();
		System.out.println();
		binaryTree.postOrder();
	}

}

package com.example.demo;

public class Stack {
	
	Node top;
	
	class Node{
		int data;
		Node(int data){
			this.data = data;
		}
		Node next;
	}
	public void add(int data) {
		// add to top
		Node node = new Node(data);
		if(null == top) {
			top = node;
		}else {
			//save at last
			node.next = top;
			top = node;
		}
	}
	public int remove() {
		if(null == top) {
			return 0;
		}else {
			Node current = top;
			top = current.next;
			return current.data;
		}
	}
	public boolean isEmpty() {
		return null == top? true: false;
	}
	public void display() {
		Node temp = top;
		while (null != temp) {
			System.out.println(temp.data);
			System.out.println("==>");
			temp = temp.next;
		}
	}
		public static void main(String[] args) {
			Stack stack =new Stack();
			stack.add(10);
			stack.add(20);
			stack.add(30);
			stack.add(40);
			stack.display();
			System.out.println(stack.remove());
			System.out.println("After removal");
			stack.display();
		}

}

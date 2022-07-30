package com.example.demo;

public class Queue {

	private Node head;
	private Node tail;
	class Node{
		int data;
		Node(int data){
			this.data = data;
		}
		Node next;
	}
	
	// add at last
	private void add(int data) {
		Node node = new Node(data);
		if(null == head) {
			head = node;
			tail = node;
		}else {
			
			tail.next = node;
			tail =node;
		}
	}
	// remove at start
	private int remove() {
		if(null == head) {
			return 0;
		}
		int data = head.data;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		return data;
	}
	
	private void displayQueue() {
		Node temp = head;
		while (null != temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.displayQueue();
		//queue.remove();
		//queue.displayQueue();

		System.out.println(queue);
	}
}

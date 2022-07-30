package com.example.demo;

public class QueueTest {
	
	Node head,tail;
	void enqueue(int data) {
		Node node = new Node(data);
		if(null == head) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
		
	}
	int dequeue() {
		int data=0;
		if(null == head) {
			return 0;
		}else {
			data = head.data;
			head = head.next;
			if(null==head) {
				tail = null;
			}
			
		}
		System.out.println("Data dequeued ==>"+ data);
		return data;
		
	}
	void print() {
		Node temp =head;
		while(null != temp) {
			System.out.println(temp.data);
			temp =temp.next;
		}
		
	}
	class Node{
		int data;
		Node(int data){
			this.data = data;
		}
		Node next;
	}
	public static void main(String[] args) {
		QueueTest queueTest = new QueueTest();
		queueTest.enqueue(10);
		queueTest.enqueue(20);
		queueTest.enqueue(30);
		queueTest.enqueue(40);
		queueTest.enqueue(50);
		queueTest.enqueue(60);
		queueTest.enqueue(70);
		queueTest.print();
		System.out.println("=========");
		queueTest.dequeue();
		queueTest.dequeue();
		queueTest.print();
	}
}

package com.example.demo;

import com.example.demo.QueueTest.Node;

public class PrioirtyQueueTest {
	
	Node head;
	
	class Node{
		int data;
		int priority;
		Node(int data,int priority){
			this.data = data;
			this.priority = priority;
		}
		Node next;
	}

	void enqueue(int data, int priority) {
		Node node = new Node(data,priority);
		if(null == head) {
			head = node;
		}else {
			if(head.priority > node.priority) {
				node.next = head;
				head = node;
			}else {
				Node temp = head;
				while(temp.next !=null && temp.next.priority < node.priority) {
					
					temp =  temp.next;
				}
				node.next = temp.next;
				temp.next = node;
			}
		}
		
	}
	void dequeue() {
		head = head.next;
	}
	void print() {
		Node node = head;
		while(null != node) {
			System.out.println(node.data+"======>"+node.priority);
			node = node.next;
		}
	}
	public static void main(String[] args) {
		PrioirtyQueueTest prioirtyQueueTest = new PrioirtyQueueTest();
		prioirtyQueueTest.enqueue(70, 1);
		prioirtyQueueTest.enqueue(60, 4);
		prioirtyQueueTest.enqueue(50, 3);
		prioirtyQueueTest.enqueue(40, 2);
		prioirtyQueueTest.enqueue(30, 5);
		prioirtyQueueTest.enqueue(20, 7);
		prioirtyQueueTest.enqueue(10, 8);
		prioirtyQueueTest.enqueue(400, 9);
		prioirtyQueueTest.print();
		prioirtyQueueTest.dequeue();
		prioirtyQueueTest.dequeue();
		System.out.println("==========");
		prioirtyQueueTest.print();
	}
}

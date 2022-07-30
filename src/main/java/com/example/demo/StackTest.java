package com.example.demo;

public class StackTest {

	Node top;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}

	int pop() {
		int data = 0;
		if (null == top) {
			top = null;
			data = 0;
		} else {
			 data = top.data;
			top = top.next;
			
		}
		System.out.println("POP===>"+data);
		return data;

	}

	void print() {
		System.out.println("--------------------------");
		Node temp = top;
		while (null != temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		StackTest stackTest = new StackTest();
		stackTest.push(10);
		stackTest.push(20);
		stackTest.push(30);
		stackTest.push(40);
		stackTest.push(50);
		stackTest.print();
		stackTest.pop();
		stackTest.pop();
		
		stackTest.print();
		stackTest.pop();
		stackTest.pop();
		stackTest.pop();
		stackTest.pop();
		stackTest.print();

	}
}

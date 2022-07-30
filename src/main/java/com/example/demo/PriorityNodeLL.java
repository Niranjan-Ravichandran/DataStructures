package com.example.demo;

public class PriorityNodeLL {
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
void add(int data, int priority) {
	Node node = new Node(data, priority);
	if(null == head) {
		head = node;
	}else {
		if(node.priority < head.priority) {
			Node temp = head;
			head = node;
			head.next = temp;
		}else {
			Node temp = head;
			while(temp.next !=null && temp.next.priority < node.priority) {
				temp = temp.next;
			}
			Node temp1=temp;
			node.next = temp1.next;
			temp.next = node;
		}
		
	}
}
void remove() {
	head = head.next ;
}
void print() {
	Node node = head;
	while(null != node) {
		System.out.println(node.data + " ==>"+node.priority);
		node = node.next;
	}
}
	public static void main(String[] args) {
		PriorityNodeLL priorityNodeLL = new PriorityNodeLL();
		priorityNodeLL.add(30, 2);
		priorityNodeLL.add(40, 5);
		priorityNodeLL.add(50, 4);
		priorityNodeLL.add(60, 3);
		priorityNodeLL.add(70, 1);
		priorityNodeLL.add(70, 7);
		priorityNodeLL.add(70, 4);
		
		priorityNodeLL.print();
		priorityNodeLL.remove();
		System.out.println();
		priorityNodeLL.print();
		//30 2
		
		//40 5
		//50 4
		

	}

}

package com.example.demo;

public class LinkedList {
	Node head, tail;

	class Node {
		int data;

		Node(int data) {
			this.data = data;
		}

		Node next;
	}

	public void add(int data) {
		Node node = new Node(data);
		if (null == head) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void remove(int data) {
		Node temp = head;
		if (head.data == data) {
			head = head.next;
		} else {
			while (temp.next != null) {
				if (temp.next.data == data) {
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void print() {
		Node node = head;
		while (null != node) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.print();
		linkedList.remove(1);
		System.out.println("=============");
		linkedList.print();
	}

}

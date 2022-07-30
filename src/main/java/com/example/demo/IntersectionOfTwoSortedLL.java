package com.example.demo;

public class IntersectionOfTwoSortedLL {

	public ListNode getIntersectionOfTwoSortedLL(ListNode node1, ListNode node2) {
		ListNode node3 = new ListNode();
		ListNode n1 = node1;
		ListNode n2 = node2;

		while (n1 != null && n2 != null) {
			if (n1.val <= n2.val) {
				node3.add(n1.val);
				n1 = n1.next;

			}
			if (n2.val <= n1.val) {
				node3.add(n2.val);
				n2 = n2.next;
			}
		}
		while (n1 == null && n2 != null) {
			node3.add(n2.val);
			n2 = n2.next;
		}
		while (n1 != null && n2 == null) {
			node3.add(n1.val);
			n1 = n1.next;
		}

		return node3;
	}

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(3);
		ListNode head3 = new ListNode(5);
		ListNode head4 = new ListNode(7);
		ListNode head5 = new ListNode(9);
		ListNode head6 = new ListNode(17);
		ListNode head7 = new ListNode(19);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		head5.next = head6;
		head6.next = head7;
				
				
		ListNode head11 = new ListNode(2);
		ListNode head12 = new ListNode(4);
		ListNode head13 = new ListNode(5);
		ListNode head14 = new ListNode(6);
		ListNode head15 = new ListNode(8);

		head11.next = head12;
		head12.next = head13;
		head13.next = head14;
		head14.next = head15;
		IntersectionOfTwoSortedLL intersectionOfNodes = new IntersectionOfTwoSortedLL();
		ListNode dummy = intersectionOfNodes.getIntersectionOfTwoSortedLL(head1, head11);
		//System.out.println(dummy);
		dummy.print();
	}

}

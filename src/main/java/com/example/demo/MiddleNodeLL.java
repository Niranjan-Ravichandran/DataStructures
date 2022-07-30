package com.example.demo;

public class MiddleNodeLL {
	 public ListNode middleNode(ListNode head) {
	        ListNode slow = head, fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        return slow;
	    }
	 public static void main(String[] args) {
		 ListNode head1 = new ListNode(1);
			ListNode head2 = new ListNode(2);
			ListNode head3 = new ListNode(3);
			ListNode head4 = new ListNode(4);
			ListNode head5 = new ListNode(5);
			ListNode head6 = new ListNode(6);
			ListNode head7 = new ListNode(7);
			head1.next = head2;
			head2.next = head3;
			head3.next = head4;
			head4.next = head5;
			head5.next = head6;
			head6.next = head7;
			new MiddleNodeLL().middleNode(head1).print();
	}
}

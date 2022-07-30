package com.example.demo;

public class OddEvenLL {

	 public ListNode oddEvenList(ListNode head) {
	        if (head == null) return null;
	        ListNode odd = head, even = head.next, evenHead = even;
	        while (even != null && even.next != null) {
	            odd.next = even.next;
	            odd = odd.next;
	            even.next = odd.next;
	            even = even.next;
	        }
	        odd.next = evenHead;
	        return head;
	    }
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		ListNode node = new OddEvenLL().oddEvenList(head1);
		node.print(node);
		
	}
}

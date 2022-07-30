package com.example.demo;

public class KThNodeFromLastLL {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode temp = head, tempNext = head;
		for(int i=0; i<n; i++) {
			tempNext = tempNext.next;
			}
		if(tempNext == null)   {
			return head = head.next;
			}
		while(tempNext.next!= null){
			temp = temp.next;
			tempNext = tempNext.next;
		}
		temp.next = temp.next.next;
		return head;
	}

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		//ListNode head6 = new ListNode(6);
		//ListNode head7 = new ListNode(7);
		head1.next = head2;
			head2.next = head3;
			head3.next = head4;
			head4.next = head5;
			//head5.next = head6;
//			head6.next = head7;
		ListNode node = new KThNodeFromLastLL().removeNthFromEnd(head1, 2);
		node.print(node);
	}
}

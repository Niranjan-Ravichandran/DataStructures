package com.example.demo;

public class ReverseKthNodeLL {
	
	ListNode reverse(ListNode head, ListNode end) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != end) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
	
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode t = head;
		int size = 0;
		while(null != t) {
			t = t.next;
			size++;
		} 
		if (k == 0 || k == 1) {
			return head;
		} else {
			ListNode temp = head;
			int count = 0;
			ListNode start = null;
			while(temp != null) {
				if(count%size!=0) {
					 start = temp;
				}
				count = count +1;
				temp = temp.next;
				if(count%size==0) {
					ListNode reverse = reverse(start, temp);
			        ListNode tempPrev = reverse;
			        while(null != tempPrev && null !=tempPrev.next) {
			        	tempPrev = tempPrev.next;
			        }
			        tempPrev.next = temp;
			        temp = reverse;
				}
			}
		}
		return head;
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
	
	ListNode node = new ReverseKthNodeLL().reverseKGroup(head1, 3);
	node.print(node);
	
}
}

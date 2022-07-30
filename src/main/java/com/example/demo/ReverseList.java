package com.example.demo;


 class ReverseList {
	    public ListNode reverseList(ListNode head) {
	        
	        ListNode prev =null;
	        ListNode next = null;
	        while(head != null){
	        	next = head.next;
	        	head.next = prev;
	        	prev = head;
	        	head = next;
	        }
	        return prev;
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
			
			ReverseList list = new ReverseList();
			ListNode node = list.reverseList(head1);
			System.out.println(node);
		}
	}
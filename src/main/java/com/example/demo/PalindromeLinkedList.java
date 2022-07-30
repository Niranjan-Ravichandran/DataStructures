package com.example.demo;

import java.util.Stack;

public class PalindromeLinkedList {

	public boolean isPalindrome(ListNode head) {
		Stack<Integer> s = new Stack<Integer>();
		ListNode head1 = head;
		int count = 0;
		while (head != null) {
			count = count + 1;
			head = head.next;
		}
		boolean isEven = count%2==0;
		int middleCount = count / 2;

		int c = 0;
		while (head1 != null) {
			if (c<middleCount) {
				s.add(head1.val);
			} else {
				if(c==middleCount && !isEven) {
					
				}
				else if(!s.isEmpty() && s.pop()!=head1.val) {
						return false;
					}
				}
			c = c + 1;
			head1 = head1.next;
		}
		return s.isEmpty()? true : false;
	}

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(2);
		
		ListNode head4 = new ListNode(1);
//		ListNode head5 = new ListNode(3);
//		ListNode head6 = new ListNode(1);

		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
//		head4.next = head5;
//		head5.next = head6;

		boolean isPalindrome = new PalindromeLinkedList().isPalindrome(head1);
		System.out.println(isPalindrome);
	}
}

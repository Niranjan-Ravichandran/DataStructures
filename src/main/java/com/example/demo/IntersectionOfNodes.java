package com.example.demo;

import com.example.demo.LinkedList.Node;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
}
    ListNode(){}
    
    public void add(int data) {
    	ListNode node = new ListNode(data);
		if (null == next) {
			next = node;
		} else {
			ListNode temp = next;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void remove(int data) {
		ListNode temp = next;
		if (next.val == data) {
			next = next.next;
		} else {
			while (temp.next != null) {
				if (temp.next.val == data) {
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void print() {
		ListNode node = next;
		while (null != node) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	public void print(ListNode n) {
		ListNode node = n;
		while (null != node) {
			System.out.println(node.val);
			node = node.next;
		}
	}
}
public class IntersectionOfNodes {
	

//	[4,1,8,4,5]
//  [5,6,1,8,4,5]

	 
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA, tempB = headB;  
        while(headA!= null){
            ListNode curr = headB;
            while(curr!=null){
                if(curr == headA){
                    return headA;
                }
                else{
                    curr = curr.next;
                }
            }
            headA = headA.next;
        }
        
        return null;
 
    }
	public static void main(String[] args) {
		ListNode head1 = new ListNode(4);
		ListNode head2 = new ListNode(1);
		ListNode head3 = new ListNode(8);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		
		ListNode head11 = new ListNode(5);
		ListNode head12 = new ListNode(6);
		ListNode head13 = new ListNode(1);
		ListNode head14 = new ListNode(8);
		ListNode head15 = new ListNode(4);
		ListNode head16 = new ListNode(5);
		
		head11.next = head12;
		head12.next = head13;
		head13.next = head14;
		head14.next = head15;
		head15.next =  head16;
		
		IntersectionOfNodes intersectionOfNodes = new IntersectionOfNodes();
		ListNode node = intersectionOfNodes.getIntersectionNode(head1, head11);
		System.out.println(node.val);
		
		
	}
}	
	
	 

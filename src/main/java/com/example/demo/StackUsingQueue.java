package com.example.demo;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
		Queue<Integer> q1= new LinkedList<>();
		Queue<Integer> q2= new LinkedList<>();
		int top;
	    public void push(int x) {
	        q1.add(x);
	    	top =x;
	    }
	    
	    public int pop() {
	    	
	    	while(q1.size()>1) {
	    		top = q1.remove();
	    		q2.add(top);
	    	}
	    	int data = q1.remove();
	    	q1 = q2;
	    	q2 = new LinkedList<Integer>();
	    	System.out.println("data poped"+data);
	        return data;
	    }
	    
	    public int top() {
	    	return top;
	    }
	    
	    public boolean empty() {
	    	
	    	return q1.size()>0?true:false;
	    }
	    void print() {
	    	System.out.println(q1);
	    }
	
	public static void main(String[] args) {
		StackUsingQueue stackTest = new StackUsingQueue();
		stackTest.push(10);
		stackTest.push(20);
		stackTest.push(30);
		stackTest.push(40);
		stackTest.push(50);
		stackTest.print();
		System.out.println("============");
		stackTest.pop();
		stackTest.pop();
		stackTest.print();
	}

}

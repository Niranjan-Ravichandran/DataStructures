package com.example.demo;

public class QueueUsingStack {

	Stack stack1 = new Stack();
	Stack stack2 = new Stack();

	public void push(int x) {
		if(stack1.isEmpty()) {
			stack1.add(x);
		}else {
			while(!stack1.isEmpty()) {
				stack2.add(stack1.remove());
			}
			stack2.add(x);
			while(!stack2.isEmpty()) {
				stack1.add(stack2.remove());
			}
		}
    }
    
    public int pop() {
    	int data = stack1.remove();
        return data;
    }
    
    public int peek() {
        return null == stack1.top?0:stack1.top.data;
    }
    
    public boolean empty() {
        return stack1.isEmpty()?true:false;
    }
    public void display() {
    	stack1.display();
    }
    public static void main(String[] args) {
    	QueueUsingStack queueUsingStack = new QueueUsingStack();
    	queueUsingStack.push(10);
    	queueUsingStack.push(20);
    	queueUsingStack.push(30);
    	queueUsingStack.push(40);
    	queueUsingStack.push(50);
    	queueUsingStack.display();
    	System.out.println("====================");
    	queueUsingStack.pop();
    	queueUsingStack.pop();
    	System.out.println("====================");
    	queueUsingStack.display();

	}
}

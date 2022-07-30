package com.example.demo;
import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
        int maximum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) == '(') {
        		stack.push(i);
        	}else {
        		stack.pop();
        		//java.util.EmptyStackException at stack.peek() so adding check
        		// adding at bottom not going to affect the logic
        		if(stack.isEmpty()) {
        			stack.push(i);
        		}else {
        			maximum = Math.max(maximum, i-stack.peek());
        		}
        	}
        }
        return maximum;
    }
	public static void main(String[] args) {
		LongestValidParentheses longestValidParentheses = new LongestValidParentheses();
		int max= longestValidParentheses.longestValidParentheses("()))(())");
		System.out.println(max);
	}
}

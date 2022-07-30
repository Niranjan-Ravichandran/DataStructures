package com.example.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SlidingMaximumWindow {

	public int[] maxSlidingWindow(int[] nums, int k) {
		// O(n) time | O(n-k+1) space
				if(nums == null || k <= 0) return new int[] {};

				int n = nums.length;
				int[] res = new int[n-k+1];
				int j = 0;
	        	Deque<Integer> deque = new ArrayDeque<>();
		        for(int i=0;i<nums.length;i++) {
		        	
		        	
		        	while(!deque.isEmpty() && deque.peek()< i-k+1) {
		        		deque.poll();
		        	}
		        	
		        	while(!deque.isEmpty() &&  nums[deque.peekLast()] < nums[i]) {
		        		deque.pollLast();
		        	}
		        	
		        	deque.offer(i);
		        	if(i+1-k>=0) {
		        		res[j++] = nums[deque.peek()];
		        		;
		        	}
		        	
		        }
				
				
				return res;
	}

	public int getMaximumWindow(Queue<Integer> queue) {
		int maximum = Integer.MIN_VALUE;
		for (Integer q : queue) {
			if (q > maximum) {
				maximum = q;
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		SlidingMaximumWindow maximumWindow = new SlidingMaximumWindow();
		int[] arr = maximumWindow.maxSlidingWindow(new int[] { 1,3,-1,-3,5,3,6,7}, 3);
		for (int n : arr) {
			System.out.println(n);
		}
	}
}

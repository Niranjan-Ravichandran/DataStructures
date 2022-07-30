package com.example.demo;

public class ClimbStairs {
	public int climbStairs(int n) {
        if(n<=1)
        {
            return 1;
        }
        int[] arr=new int[n];
        arr[0]=arr[1]=1;
        for(int i=2;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
    
    return  arr[n-1]+arr[n-2];
}
	
	public static void main(String[] args) {
		ClimbStairs climbStairs = new ClimbStairs();
		int count =climbStairs.climbStairs(10);
		System.out.println(count);
	}
}

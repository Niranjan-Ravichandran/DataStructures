package com.example.demo;

public class Factorial {
	 int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
			  System.out.println("n==>"+n);
		    return(n * factorial(n-1));    
		 }   
	 int factorialDynamic(int n){  
		 int[] f = new int[n];
		 f[0]=1;
		 f[1]=1;
		 for(int i=2;i<n;i++) {
			 f[i] = f[i-1]+f[i-2];
		 }
		 return f[n-1];
		 } 
	
	public static void main(String[] args) {
		int n = new Factorial().factorialDynamic(10);
		System.out.println(n);
	}
}

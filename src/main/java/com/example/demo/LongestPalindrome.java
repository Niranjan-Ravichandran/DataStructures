package com.example.demo;

public class LongestPalindrome {
	
	public static boolean isPalindrome(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	 public static String longestPalindrome(String s) {
	     String palindrome = "";
	        int l=0,r=s.length();
	        while(l<=r) {
	        	if(l==r && new StringBuffer(s.substring(l)).reverse().toString().equals((s.substring(l)))) {
	        		palindrome = s.substring(l);
	        		break;
	        	}
	        	else if(new StringBuffer(s.substring(l,r)).reverse().toString().equals((s.substring(l, r)))) {
	        		palindrome = s.substring(l, r);
	        		break;
	        	}
	        	l++;
	        	r--;
	        }
	        
	        return palindrome;
	    }
	
	public static void main(String[] args) {
		String s = LongestPalindrome.longestPalindrome("ac");
		System.out.println(s);
	}

}

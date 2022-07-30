package com.example.demo;

import java.util.Arrays;

public class LongestIncreasingSubstring {
	public int lengthOfLIS(int[] nums)  {
		 int maxLen = 1;
	        // dp[i] means the length of longest subsequence ending of the nums[i]
	        int[] dp = new int[nums.length];
	        Arrays.fill(dp, 1);
	        for (int i = 1; i < nums.length; i++) {
	            // find whether of not we can increase the length of increasing subsequence
	            for (int j = i - 1; j >= 0; j--) {
	                if (nums[i] > nums[j]) {
	                    dp[i] = Math.max(dp[i], dp[j] + 1);
	                }
	            }
	            maxLen = Math.max(maxLen, dp[i]);
	        }
	        printIncreasingSubstring(dp,nums);
	        return maxLen;
    }
	void printIncreasingSubstring(int[] dp, int[] nums) {
		for(int i=0;i<dp.length-1;i++) {
			if(dp[i+1]!=dp[i] && dp[i]==1) {
				System.out.println(nums[i]);
			}
			if(dp[i+1]!=dp[i]) {
				//System.out.println(nums[i]);
				System.out.println(nums[i+1]);
			}
		}
	}
   
    public static void main(String[] args) {
		LongestIncreasingSubstring increasingSubstring =new LongestIncreasingSubstring();
		int arr = increasingSubstring.lengthOfLIS(new int[] {10,9,2,5,3,7,101,18});
		// 10 9 2 5 3 7 101 18
		// 1  1 1 2 2 3  4  4
		System.out.println(arr);
	}
}

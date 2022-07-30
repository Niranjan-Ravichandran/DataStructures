package com.example.demo;
/*
 * 		a	c	e
	0	0	0	0
a	0	1	1	1
b	0	1	1	1
c	0	1	2	2
d	0	1	2	2
e	0	1	2	3

 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        int[][] dp = new int[n+1][m+1];
        for(int i = 1; i < n+1; ++i)
        {
            for(int j = 1; j < m+1; ++j)
            {
                if(text1.charAt(i-1) == text2.charAt(j-1))
                {
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        printCommonSubString(n, m, dp, text1, text2);
        
        return dp[n][m];
    }
    public void printCommonSubString(int n,int m, int[][] dp,String X, String Y) {
    	// Following code is used to print LCS
        int index = dp[n][m];
        int temp = index;
 
        char[] lcs = new char[index + 1];
        lcs[index]
            = '\u0000'; 
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            // If current character in X[] and Y are same,
            // then current character is part of LCS
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                // Put current character in result
                lcs[index - 1] = X.charAt(i - 1);
 
                // reduce values of i, j and index
                i--;
                j--;
                index--;
            }
 
            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (dp[i - 1][j] > dp[i][j - 1])
                i--;
            else
                j--;
        }
 
        // Print the lcs
        System.out.print("LCS of " + X + " and " + Y
                         + " is ");
        for (int k = 0; k <= temp; k++)
            System.out.print(lcs[k]);
    }
public static void main(String[] args) {
	LongestCommonSubsequence commonSubsequence =new LongestCommonSubsequence();
	int count =commonSubsequence.longestCommonSubsequence("abcde", "ace");
	System.out.println(count);
}
}

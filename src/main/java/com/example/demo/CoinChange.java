package com.example.demo;
/*
 * 		1	2	3	4	5	6	7	8	9	10	11
	0	2147483647	2147483647	2147483647	2147483647	2147483647	2147483647	2147483647	2147483647	2147483647	2147483647	2147483647
1	0	1	2	3	4	5	6	7	8	9	10	11
2	0	1	1	2	2	3	3	4	4	5	5	6
5	0	1	1	2	2	1	2	2	3	3	2	3

 */
public class CoinChange {
	
	public int coinChange(int[] coins, int amount) {
        // amount is 0...
        if(amount == 0) {
            return 0;    
        }
        
        // making a matrix...
        int[][] table = new int[coins.length+1][amount+1];
        
        // initial filling...
        for(int i=0; i<amount+1; i++) {
            table[0][i] = Integer.MAX_VALUE;
        }
        for(int i=0; i<coins.length+1; i++) {
            table[i][0] = 0;
        }
        
        for(int i=1;i<coins.length+1;i++) {
        	for(int j=1;j<amount+1;j++) {
        		if(j>=coins[i-1]) {
        			table[i][j]=Math.min(table[i-1][j],
        					 ((table[i][j-coins[i-1]] == Integer.MAX_VALUE)?0:1)+table[i][j-coins[i-1]]);
        		}else {
        			table[i][j]=table[i-1][j];
        		}
        	}
        }
        
        // getting the answer...
        int ans = table[table.length-1][table[0].length-1];
        // validating answer for anomalies..
        return (Math.abs(ans)==Integer.MAX_VALUE || ans==0 )?-1:ans;
    }
public static void main(String[] args) {
	CoinChange coinChange = new CoinChange();
	int output = coinChange.coinChange(new int[] {1,2,5}, 11);
	System.out.println(output);
}
}

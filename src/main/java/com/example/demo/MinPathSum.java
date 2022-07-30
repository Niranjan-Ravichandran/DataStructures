package com.example.demo;

public class MinPathSum {
	
	public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }else if (i == 0) {
                    grid[i][j] += grid[i][j-1];
                }else if (j == 0) {
                    grid[i][j] += grid[i-1][j];
                }else {
                    grid[i][j] = Math.min(grid[i][j] + grid[i-1][j], grid[i][j] + grid[i][j-1]);
                }
            }
        }
        return grid[n-1][m-1];
    }
	
	public static void main(String[] args) {
		MinPathSum minPathSum = new MinPathSum();
		minPathSum.minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}});
	}

}

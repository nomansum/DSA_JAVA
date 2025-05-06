import java.util.Arrays;

public class MinimumPathSum {


    // https://leetcode.com/problems/minimum-path-sum/

    public int minPathSum(int[][] grid) {

        int m , n;
        m = grid.length;
        n = grid[0].length;
        int[][] dp = new int[m][n];

        for(int i=0;i<m;++i){
            Arrays.fill(dp[i],-1);
        }

     return   solve(grid,dp,m-1,n-1);
        //return dp[m-1][n-1];

    }


    public int solve(int[][] grid , int[][] dp , int i , int j){

        if(i==0 && j==0) return dp[i][j] = grid[i][j];
        if(i<0 || j<0) return 100000009;
       if(dp[i][j]!=-1) return dp[i][j];

        int up = grid[i][j] + solve(grid,dp,i-1,j);
        int left = grid[i][j] + solve(grid,dp,i,j-1);

          return dp[i][j] = Math.min(up,left);

    }


    public static void main(String[] args) {




    }


}

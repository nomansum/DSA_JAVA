import java.util.Arrays;

public class MinimumPathSumPracticeTabu {


    public int minPathSum(int[][] grid) {

        int m , n;
        m = grid.length;
        n = grid[0].length;
        int[][] dp = new int[m][n];

        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){

                if(i==0 && j==0){
                    dp[i][j] = grid[0][0];
                    continue;
                }
                int up = grid[i][j];
                int left = grid[i][j];
                if(i>0){
                    up += dp[i-1][j];

                }
                else {
                    up += 100000009;
                }
                if(j>0){
                    left += dp[i][j-1];
                }
                else {
                    left += 100000009;
                }

                dp[i][j] = Math.min(left,up);


            }
        }



       return dp[m-1][n-1];
        //return dp[m-1][n-1];

    }



}

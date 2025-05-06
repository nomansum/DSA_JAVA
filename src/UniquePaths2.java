import java.util.Arrays;

public class UniquePaths2 {




    // https://leetcode.com/problems/unique-paths-ii/description/

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];

        for(int i=0;i<m;++i){
            Arrays.fill(dp[i],-1);
        }

        solve(dp,obstacleGrid,m-1,n-1);


        return dp[m-1][n-1]==-1?0:dp[m-1][n-1];

    }


    public int solve(int[][] dp,int[][] obstacleGrid,int i , int j){

        if(i>=0 && j>=0 && obstacleGrid[i][j]==1) return 0;

        if(i==0 && j==0) return dp[i][j]=1;
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j] = solve(dp,obstacleGrid,i-1,j)+solve(dp,obstacleGrid,i,j-1);


    }






}

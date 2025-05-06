import java.util.Arrays;

public class MimimumFallingPathSumPractice {

    public int minFallingPathSum(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp  = new int[m][n];
        for(int i=0;i<m;++i){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }

        int result = Integer.MAX_VALUE;

        for(int i=0;i<n;++i){
            int tempResult = solve(dp,0,i,m,n,matrix);
            result = Math.min(tempResult,result);
        }


return result;

    }

    public int solve(int[][] dp , int i,int j,int  m , int n,int[][] matrix){
        if(j<0 || j>=n) return 100000009;
        if(i>=m) return 10000009;
        if(i==m-1) return dp[i][j] = matrix[i][j];
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];

        int down = matrix[i][j] + solve(dp,i+1,j,m,n,matrix);
        int left = matrix[i][j]+solve(dp,i+1,j-1,m,n,matrix);
        int right = matrix[i][j]+ solve(dp,i+1,j+1,m,n,matrix);

        return dp[i][j] = Math.min(down,Math.min(left,right));





    }




}

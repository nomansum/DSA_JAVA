import java.util.Arrays;

public class MinimumFallingPathSum {

    // https://leetcode.com/problems/minimum-falling-path-sum/description/
    public int minFallingPathSum(int[][] matrix) {


        int[][] dp = new int [matrix.length][matrix.length];

        for ( int i=0;i<matrix.length;++i){
            dp[0][i] = matrix[0][i];
        }
        for(int i=1;i<matrix.length;++i){

            for(int j=0;j<matrix.length;++j){

                int up = matrix[i][j] + dp[i-1][j];
              //  int rup = matrix[i][j] + solve(matrix,dp,i-1,j+1,n);
               int rup = 100000009;
               int lup = 100000009;
               if(j-1>0) lup = matrix[i][j] + dp[i-1][j-1];
               if(j+1<matrix.length) rup = matrix[i][j] + dp[i-1][j+1];
               dp[i][j] = Math.min(up,Math.min(rup,lup));

            }

        }

        int result = Integer.MAX_VALUE;

        for(int i=0;i<matrix.length;++i){
            result = Math.min(result,dp[matrix.length-1][i]);
        }

return result;


    }

    public int solve(int[][] matrix , int[][] dp , int i, int j, int n){

        if(j<0 || j>=n) return 100000009;
        if(i==0) return matrix[0][j];

        if(dp[i][j]!=-1) return dp[i][j];

        int up = matrix[i][j] + solve(matrix,dp,i-1,j,n);
        int lup = matrix[i][j] + solve(matrix,dp,i-1,j-1,n);
        int rup = matrix[i][j] + solve(matrix,dp,i-1,j+1,n);

        return dp[i][j] = Math.min(up,Math.min(lup,rup));



    }


}


//public int minfallingPathSum_Tabulation(int matrix[][]){
//
//    int n = matrix.length;
//    int dp[][] = new int[n][n];
//    for(int i = 0; i < n; i++){
//        dp[n-1][i] = matrix[n-1][i];
//    }
//
//    for(int row = n-2; row >= 0; row--){
//        for(int col = n-1; col >= 0; col--){
//
//            if(col == 0){
//                dp[row][col] = matrix[row][col] + Integer.min(dp[row+1][col], dp[row+1][col+1]);
//            }
//            else if(col == n-1){
//                dp[row][col] = matrix[row][col] + Integer.min(dp[row+1][col], dp[row+1][col-1]);
//            }
//            else{
//                dp[row][col] = matrix[row][col] + Integer.min(dp[row+1][col], Integer.min(dp[row+1][col-1], dp[row+1][col+1]));
//            }
//        }
//    }
//    int ans = Integer.MAX_VALUE;
//    for(int i = 0; i < n; i++){
//        ans = Integer.min(dp[0][i], ans);
//    }
//    return ans;
//}
//public int minFallingPathSum(int[][] matrix) {
//
//    return minfallingPathSum_Tabulation(matrix);
//}

import java.util.Arrays;

public class MaximalSquare {


int ans = 0;

    public int maximalSquare(char[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        int[][] dp = new int[r+1][c+1];

        for(int[] val : dp){
            Arrays.fill(val,-1);
        }

 solve(0,0,r,c,dp,matrix);
return ans*ans;
    }

public int solve(int r, int c ,int ROW,int COL, int[][] dp,char[][] matrix){

    if(r>=ROW || c>=COL) return 0;

    if(dp[r][c]!=-1) return dp[r][c];

    int down = solve(r+1,c,ROW,COL,dp,matrix);
    int right = solve(r,c+1,ROW,COL,dp,matrix);
    int diag = solve(r+1,c+1,ROW,COL,dp,matrix);

    if(matrix[r][c]=='1'){
        dp[r][c] = 1 + Math.min(down,Math.min(right,diag));
        ans = Math.max(ans,dp[r][c]);
    }
        else dp[r][c]=0;

        return dp[r][c];


}



}

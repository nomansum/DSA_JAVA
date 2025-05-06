import java.util.Arrays;

public class UniquePaths {


    // https://leetcode.com/problems/unique-paths/description/

    public int uniquePaths(int m, int n) {

        int dp[][] = new int[m][n];

        for(int i=0;i<m;++i){
            Arrays.fill(dp[i],-1);
        }

        solve(dp,m-1,n-1);


        return dp[m-1][n-1];
    }

    public int solve(int[][] dp,int i , int j){

        if(i==0 && j==0) return dp[i][j]=1;
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        return dp[i][j] = solve(dp,i-1,j)+solve(dp,i,j-1);


    }

    public static void main(String[] args) {

    }



}

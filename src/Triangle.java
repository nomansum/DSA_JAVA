import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {


    // https://leetcode.com/problems/triangle/description/
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;++i){
            Arrays.fill(dp[i],-1);
        }
        solve(triangle,dp,0,0,n);
        return dp[0][0];

    }


public int solve(List<List<Integer>> triangle,int[][] dp,int i,int j,int n)
{
    if(i==n-1) {
        return dp[i][j] = triangle.get(i).get(j);
    }
    if(dp[i][j]!=-1) return dp[i][j];

    int down = triangle.get(i).get(j) + solve(triangle,dp,i+1,j,n);
    int diagonal = triangle.get(i).get(j) + solve(triangle,dp,i+1,j+1,n);

    return dp[i][j] = Math.min(down,diagonal);




}



}

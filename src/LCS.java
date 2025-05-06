import java.util.Arrays;

public class LCS {

    // https://leetcode.com/problems/longest-common-subsequence/description/
    public int longestCommonSubsequence(String text1, String text2) {

 int n  = text1.length();
 int m = text2.length();

int[][] dp = new int[n+1][m+1];

for(int[] values:dp){
    Arrays.fill(values,-1);
}
        
 solve(text1,text2,n,m,dp);
int i=n;
int j = m;
int len = dp[n][m];
StringBuilder ans = new StringBuilder();
while(i>0 && j>0){

    if(text1.charAt(i-1)==text2.charAt(j-1)){
        ans.append(text1.charAt(i-1));
        i--;
        j--;
        len--;
    }
    else if(dp[i-1][j]>dp[i][j-1]){
        i--;
    }
    else j--;


}
        System.out.println(ans.toString());
return dp[n][m];
    }

    public int solve(String text1,String text2, int i , int j,int[][] dp){

        if(i==0 || j==0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        if(text1.charAt(i-1)==text2.charAt(j-1)){
            return dp[i][j]  = 1 + solve(text1,text2,i-1,j-1,dp);
        }

        return dp[i][j] = Math.max(solve(text1,text2,i-1,j,dp),solve(text1,text2,i,j-1,dp));


    }


}

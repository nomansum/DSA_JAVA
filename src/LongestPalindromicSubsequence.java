import java.util.Arrays;

public class LongestPalindromicSubsequence {




    // https://leetcode.com/problems/longest-palindromic-subsequence/description/
    public int longestPalindromeSubseq(String s) {

        int n = s.length();

        int[][] dp = new int[n+1][n+1];

        for(int[] values:dp) Arrays.fill(values,-1);

        StringBuilder reverseString = new StringBuilder(s);
        reverseString.reverse();
        return solve(s,reverseString.toString(),n,n,dp);



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

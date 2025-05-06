import java.util.Arrays;

public class DeleteOperationsForTwoStrings {




    // https://leetcode.com/problems/delete-operation-for-two-strings/description/
    public int minDistance(String word1, String word2) {

        return word1.length()+word2.length() - (2*longestPalindromeSubseq(word1,word2));


    }


    public int longestPalindromeSubseq(String s1,String s2) {

        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n+1][m+1];

        for(int[] values:dp) Arrays.fill(values,-1);


        return solve(s1,s2,n,m,dp);



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

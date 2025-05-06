import java.util.Arrays;

public class EditDistance {




    // https://leetcode.com/problems/edit-distance/description/
    public int minDistance(String word1, String word2) {

   int[][] dp = new int[word1.length()+1][word2.length()+1];

  for(int[] values:dp){
      Arrays.fill(values,-1);
  }


 return solve(word1,word2,dp,word1.length(),word2.length());


    }


public  int solve(String word1,String word2, int[][] dp,int i, int j){

if(i==0) return j;
if(j==0) return i;

if(dp[i][j]!=-1) return dp[i][j];
if(word1.charAt(i-1)==word2.charAt(j-1)){
   return  dp[i][j] = 0 + solve(word1,word2,dp,i-1,j-1);
}

return dp[i][j] = 1 +  Math.min(solve(word1,word2,dp,i,j-1),
        Math.min(solve(word1,word2,dp,i-1,j),
                solve(word1,word2,dp,i-1,j-1)));





}




}

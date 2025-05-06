import java.util.Arrays;

public class WildcardMatching {


    // https://leetcode.com/problems/wildcard-matching/description/
    public boolean isMatch(String s, String p) {


        int[][] dp = new int[p.length()][s.length()];
       for(int[] values:dp)Arrays.fill(values,-1);

        return solve(s,p,p.length()-1,s.length()-1,dp)==1?true:false;

    }


    public  static int solve(String s, String p, int i, int j,int[][] dp){


        if(i<0 && j<0) return 1;
        if(i<0 && j>=0) return 0;
        if(j<0 && i>=0) return isAllStars(p,i)==true?1:0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(p.charAt(i)==s.charAt(j)||p.charAt(i)=='?'){
            return dp[i][j] =  solve(s,p,i-1,j-1,dp);
        }
else {
    if(p.charAt(i)=='*'){
        return dp[i][j] = (solve(s,p,i-1,j,dp)==1||solve(s,p,i,j-1,dp)==1)?1:0;

    }
    else return 0;
        }

    }

  public  static int wildcardMatchingUtil(String S1, String S2, int i, int j, int[][] dp) {
        // Base Cases
        if (i < 0 && j < 0)
            return 1; // Both strings are empty, and the pattern matches.
        if (i < 0 && j >= 0)
            return 0; // S1 is empty, but there are characters left in S2.
        if (j < 0 && i >= 0)
            return isAllStars(S1, i) ? 1 : 0; // S2 is empty, check if remaining characters in S1 are all '*'.

        // If the result is already computed, return it.
        if (dp[i][j] != -1) return dp[i][j];

        // If the characters match or S1 has a '?', continue matching the rest of the strings.
        if (S1.charAt(i) == S2.charAt(j) || S1.charAt(i) == '?')
            return dp[i][j] = wildcardMatchingUtil(S1, S2, i - 1, j - 1, dp);

        else {
            if (S1.charAt(i) == '*') {
                // Two possibilities when encountering '*':
                // 1. '*' matches one or more characters in S2.
                // 2. '*' matches zero characters in S2.
                return dp[i][j] = (wildcardMatchingUtil(S1, S2, i - 1, j, dp) == 1 || wildcardMatchingUtil(S1, S2, i, j - 1, dp) == 1) ? 1 : 0;
            } else {
                // Characters don't match, and S1[i] is not '*'.
                return 0;
            }
        }
    }

public static boolean isAllStars(String s,int i){

        for(int j=0;j<=i;++j){
            if(s.charAt(j)!='*') return false;
        }
        return true;

}






}

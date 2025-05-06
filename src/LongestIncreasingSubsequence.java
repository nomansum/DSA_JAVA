import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestIncreasingSubsequence {


    // https://leetcode.com/problems/longest-increasing-subsequence/description/
    public static int lengthOfLIS(int[] nums) {

           int[][]  dp = new int[nums.length+1][nums.length+1];

   for(int[] values:dp) Arrays.fill(values,-1);
return solve(0,-1,dp,nums);

    }

    public static int solve(int idx,int prevIdx,int[][] dp  , int[] arr){

        if(idx==arr.length) return 0;

        if(dp[idx][prevIdx+1]!=-1) return dp[idx][prevIdx+1];
        int len = 0 + solve(idx+1,prevIdx,dp,arr);

        if(prevIdx==-1 || arr[idx]>arr[prevIdx]){
            len = Math.max(len,1+solve(idx+1,idx,dp,arr));
        }

return dp[idx][prevIdx+1] = len;

    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};


        System.out.println(lengthOfLIS(arr));

    }





}

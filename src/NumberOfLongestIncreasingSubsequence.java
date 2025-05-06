import java.util.Arrays;

public class NumberOfLongestIncreasingSubsequence {


    // https://leetcode.com/problems/number-of-longest-increasing-subsequence/description/
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr = nums;
        int[] dp1 = new int[n];
        int maxi = 1;
        Arrays.fill(dp1,1);
        int[] cnt = new int[n];
        Arrays.fill(cnt,1);

        for(int i=0;i<n;++i){

            for(int j=0;j<i;++j){
                if(arr[j]<arr[i] && (1+dp1[j])>dp1[i]){
                    dp1[i] =  1 + dp1[j];
                    cnt[i] = cnt[j];
                }
                else if(arr[j]<arr[i] && (1+dp1[j])==dp1[i]){
                    cnt[i]+=cnt[j];
                }
            }
            maxi = Math.max(maxi,dp1[i]);

        }



        int result = 0;

        for(int i=0;i<n;++i){
            if(dp1[i]==maxi){
                result += cnt[i];
            }
        }
        return result;
    }









}

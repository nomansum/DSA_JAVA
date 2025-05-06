import java.util.Arrays;

public class TargetSum {





    // https://leetcode.com/problems/target-sum/description/
    public int findTargetSumWays(int[] nums, int target) {
            int totSum = 0;

            for (int i = 0; i < nums.length; i++) {
                totSum += nums[i];
            }

            if (totSum - target < 0)
                return 0;
            if ((totSum - target) % 2 == 1)
                return 0;

            int s2 = (totSum - target) / 2;

            int dp[][] = new int[nums.length][s2 + 1];

            for (int row[] : dp)
                Arrays.fill(row, -1);

            return solve(nums.length - 1, s2, nums, dp);

    }
public int solve (int index,int sum, int[] nums,int[][] dp){

        if(index==0){
            if(sum==0 && nums[0]==0)return 2;
            if(sum==0 || sum == nums[index]) return 1;
            return 0;
        }

        if(dp[index][sum]!=-1) return dp[index][sum];
        int notTaken = solve(index-1,sum,nums,dp);
        int taken = 0;

        if(nums[index]<=sum) taken = solve(index-1,sum-nums[index],nums,dp);

        return dp[index][sum] = notTaken+taken;




}

    public static void main(String[] args) {

    }





}

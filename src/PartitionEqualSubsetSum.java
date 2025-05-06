public class PartitionEqualSubsetSum {


    // https://leetcode.com/problems/partition-equal-subset-sum/description/
    public boolean canPartition(int[] nums) {


        int totalSum = 0;
        for(int val:nums){
            totalSum+=val;
        }
        if(totalSum%2==1){
            return false;
        }
        return isSubsetSum(nums,totalSum/2);


    }




    public  Boolean isSubsetSum(int arr[], int sum) {
        boolean[][] dp = new boolean[arr.length+1][50000];

        for(int i=0;i<arr.length;++i){
            dp[i][0] = true;
        }
        dp[0][arr[0]] = true;

        for(int idx=1;idx<arr.length;++idx){
            for(int target = 1;target<=sum;++target){
                boolean notTake = dp[idx-1][target];
                boolean take = false;
                if(arr[idx]<=target)take=dp[idx-1][target-arr[idx]];
                dp[idx][target] = take | notTake;

            }
        }
        return dp[arr.length-1][sum];

    }





}

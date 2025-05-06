public class SubsetSumEqToTarget {






    static Boolean isSubsetSum(int arr[], int sum) {
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



    static Boolean solve(int[] arr, int sum , boolean[][] dp,int idx){

        if(sum==0) return true;
        if(idx == 0) return arr[0]==sum;
        if(dp[idx][sum]==true)return true;
        boolean notTake = solve(arr,sum,dp,idx-1);
        boolean take = false;
        if(arr[idx]<=sum)take=solve(arr,sum-arr[idx],dp,idx-1);


return dp[idx][sum] = notTake | take;



    }







}

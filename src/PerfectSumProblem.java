import java.util.Arrays;

public class PerfectSumProblem {

// https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=perfect-sum-problem

    public int perfectSum(int num[],int tar)
    {

    int n = num.length;

    int[][] dp =  new int[n][tar+1];

    for(int i=0;i<n;++i)dp[i][0] = 1;
    if(num[0]<=tar) dp[0][num[0]] = 1;
    for(int index = 1 ;index<n;++index){


        for(int sum = 0;sum<=tar;++sum){

            int notTake = dp[index-1][sum];
            int take = 0;
            if(num[index]<=sum){
                take  = dp[index-1][sum-num[index]];
            }
            dp[index][sum] = notTake+take;


        }

    }


return dp[n-1][tar];

    }


    public int solve(int[] arr , int n, int sum , int  index,int[][] dp){

       if(sum==0) return 1;
       if(index==0) return arr[0] == sum?1:0;
       if(dp[index][sum]!=-1) return dp[index][sum];

       int take=0;
       int notTake = solve(arr,n,sum,index-1,dp) % 1000000007;
       if(arr[index]>=sum) take = solve(arr,n,sum-arr[index],index-1,dp) % 1000000007;

       return dp[index][sum] = (take + notTake) % 1000000007;

    }


}

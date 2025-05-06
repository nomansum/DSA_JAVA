import java.util.Arrays;

public class MinCostClimbingStairs {






    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length+1];
        Arrays.fill(dp,-1);

        return Math.min(solve(dp,cost.length-1,cost),solve(dp,cost.length-2,cost));

    }
    public  int solve(int[] dp,int idx,int[] cost){

        if(idx < 0) return 0;

    if(idx==1 || idx  ==0) return cost[idx];
    
      if(dp[idx]!=-1) return dp[idx];

    int one = cost[idx] + solve(dp,idx-1,cost);
    int two = cost[idx] + solve(dp,idx-2,cost);

return    dp[idx] = Math.min(one,two);



    }







}

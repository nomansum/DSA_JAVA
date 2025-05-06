import java.util.Arrays;

public class BestTimeToBuyAndSellStock2 {


    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
    public int maxProfit(int[] prices) {

int[][] dp  = new int[prices.length][2];
       for(int[] values:dp)Arrays.fill(values,-1);
return solve(1,0,prices,dp);

    }

    public int solve(int buy, int idx, int[] prices,int[][] dp ){

        if(idx == prices.length) return 0;
       int profit = 0;
       if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
            profit = Math.max(-prices[idx]+solve(0,idx+1,prices,dp),0+solve(1,idx+1,prices,dp));
        }
        else {
            profit = Math.max(prices[idx]+solve(1,idx+1,prices,dp),0+solve(0,idx+1,prices,dp));

        }


 return dp[idx][buy]=profit;
    }



}

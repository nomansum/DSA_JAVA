import java.util.Arrays;

public class BestTimeToBuyAndSellStocksTransactionFee {





    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
    public int maxProfit(int[] prices, int fee) {

        int[][] dp  = new int[prices.length][2];
        for(int[] values:dp) Arrays.fill(values,-1);
        return solve(1,0,prices,dp,fee);

    }

    public int solve(int buy, int idx, int[] prices,int[][] dp,int fee ){

        if(idx == prices.length) return 0;
        int profit = 0;
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){
            profit = Math.max(-prices[idx]+solve(0,idx+1,prices,dp,fee),0+solve(1,idx+1,prices,dp,fee));
        }
        else {
            profit = Math.max(prices[idx]-fee+solve(1,idx+1,prices,dp,fee),0+solve(0,idx+1,prices,dp,fee));

        }


        return dp[idx][buy]=profit;
    }





}

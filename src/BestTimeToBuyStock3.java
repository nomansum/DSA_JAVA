import java.util.Arrays;

public class BestTimeToBuyStock3 {





    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/description/
    public int maxProfit(int[] prices) {

        int[][][] dp = new int[prices.length+1][2][3];
        for(int[][] values:dp){
            for(int[] val:values) Arrays.fill(val,-1);
        }
        return solve(dp,0,1,2,prices);


    }



    public static int solve(int[][][] dp,int idx,int buy, int capacity,int[] prices){

        if(idx==prices.length || capacity==0) return 0;

        if(dp[idx][buy][capacity]!=-1) return dp[idx][buy][capacity];

        int profit  = 0;
        if(buy==1){
            return dp[idx][buy][capacity] = Math.max(
              -prices[idx]+solve(dp,idx+1,0,capacity,prices),
                    0+solve(dp,idx+1,1,capacity,prices)
            );
        }

 return dp[idx][buy][capacity] = Math.max(
         prices[idx]+solve(dp,idx+1,1,capacity-1,prices),
         0+solve(dp,idx+1,0,capacity,prices)
 );

    }



}

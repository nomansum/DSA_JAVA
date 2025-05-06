import java.util.Arrays;

public class BestTimeToBuyAndSellStocksWithCooldown {



    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/
    public static int maxProfit(int[] prices) {

    int[][] dp = new int[prices.length+1][2];
    for(int[] values:dp){
        Arrays.fill(values,-1);
    }


        return maxProfit(0,1,dp,prices);
    }


    public  static int maxProfit(int idx,int buy,int[][] dp, int[] prices){
        if(idx>=prices.length) return 0;

        int profit = 0;
       // System.out.println("idx" + " "+idx +" buy "+buy);
        if(dp[idx][buy]!=-1) return dp[idx][buy];
        if(buy==1){

            profit = Math.max(
                    -prices[idx]+maxProfit(idx+1,0,dp,prices),
                    0+maxProfit(idx+1,1,dp,prices)

            );

        }
        else {
            profit = Math.max(
                    prices[idx]+maxProfit(idx+2,1,dp,prices),

                 0+maxProfit(idx+1,0,dp,prices)
            );
        }

        return dp[idx][buy] = profit;


    }


    public static void main(String[] args) {

        int[] prices  = {1,2,3,0,2};
        System.out.println(maxProfit(prices));



    }


}

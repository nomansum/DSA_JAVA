public class BestTimeToBuyandSellStock {
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


    public int maxProfit(int[] prices) {
       int profit = 0;
       int minTillNow = prices[0];
       for(int i = 1;i<prices.length;++i){
           if(prices[i]-minTillNow>profit){
               profit = prices[i]-minTillNow;
           }
           if(prices[i]<minTillNow){
               minTillNow = prices[i];
           }
       }
       return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyandSellStock solution = new BestTimeToBuyandSellStock();
        int[] arr = {3,2,6,5,0,3};
        System.out.println(solution.maxProfit(arr));
    }
}

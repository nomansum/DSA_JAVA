import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class CountBinarySubstring {


    void outerMethod() {
        int count = 5; // effectively final (not modified)

        class Inner {
            
            void print() {
                System.out.println(count); // ✅ Allowed
            }
        }


        Inner in = new Inner();
        in.print();
    }

    public static void main(String[] args) {


    }

int majorityElement(int[] arr){

        int value = arr[0];
        int count = 0;

        for(int val:arr){
            if(val==value) count++;
            else if(count==0){
                value = val;
            }
            else count--;
        }

       return value;

}

    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        for(int[] values:dp) Arrays.fill(dp,-1);
       return solveForMaxProfit(0,1,prices,dp);


    }
    public int solveForMaxProfit(int idx, int buy,int[] prices,int[][] dp){
  if(idx==prices.length)return 0;
  if(dp[idx][buy]!=-1) return dp[idx][buy];
  int profit = 0;

  if(buy==1){
      profit = Math.max(-prices[idx]+solveForMaxProfit(idx+1,0,prices,dp),0+solveForMaxProfit(idx+1,1,prices,dp));
  }
  else {
      profit = Math.max(prices[idx]+solveForMaxProfit(idx+1,1,prices,dp),0+solveForMaxProfit(idx+1,0,prices,dp));
  }

 return dp[idx][buy] = profit;
    }


    public int maxProkfit(int[] prices) {

        int minTillNow  = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int val:prices){

            if(val<minTillNow)minTillNow=val;

            maxProfit = Math.max(maxProfit,val-minTillNow);


        }

        return maxProfit;
    }




}

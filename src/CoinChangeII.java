import java.util.Arrays;

public class CoinChangeII {






    // https://leetcode.com/problems/coin-change-ii/description/
    public int change(int amount, int[] coins) {
 int[][] dp = new int[coins.length][amount+1];
 for(int[] values:dp){
     Arrays.fill(values,-1);
 }

        return solve(coins,coins.length-1,amount,dp);

    }




    public int solve(int[] coins,int index,int amount , int[][] dp){

        if(index==0){
            if(amount%coins[0]==0){
                return 1;
            }
            else return 0;
        }
        if(dp[index][amount]!=-1) return dp[index][amount];

        int notTake =  solve(coins,index-1,amount,dp);
        int take = 0;
        if(coins[index]<=amount){
            take  =  solve(coins,index,amount-coins[index],dp);
        }

        return dp[index][amount] = take+notTake;
    }







}

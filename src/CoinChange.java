import java.util.Arrays;

public class CoinChange {




    // https://leetcode.com/problems/coin-change/description/

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;
        int[][] dp = new int[n][amount+1];

        for(int[] values:dp){
            Arrays.fill(values,-1);
        }
        int ans = solve(coins,n-1,amount,dp);

        if(ans>=(int) Math.pow(10,9)) return -1;
        return ans;


    }

    public int solve(int[] coins,int index,int amount , int[][] dp){

        if(index==0){
            if(amount%coins[0]==0){
                return amount/coins[0];
            }
            else return (int) Math.pow(10,9);
        }
        if(dp[index][amount]!=-1) return dp[index][amount];

        int notTake = 0 + solve(coins,index-1,amount,dp);
        int take = (int) Math.pow(10,9);
        if(coins[index]<=amount){
            take  = 1 + solve(coins,index,amount-coins[index],dp);
        }

        return dp[index][amount] = Math.min(notTake,take);
    }





}

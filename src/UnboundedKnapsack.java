import java.util.Arrays;

public class UnboundedKnapsack {



   public int unBoundedKnapsack(int n, int w, int[] val,int[] weight){

       int[][] dp = new int[val.length][w+1];

       for(int[] values : dp){
           Arrays.fill(values,-1);
       }

return solve(n-1,w,val,weight,dp);



    }


    public int solve(int index,int W,int[] val,int[] weight,int[][] dp){

       if(index==0) return ((int)(W/weight[0]))*val[0];

       if(dp[index][W]!=-1) return dp[index][W];

       int notTake = 0 + solve(index-1,W,val,weight,dp);

       int take = 0;

       if(weight[index]<=W){
           take = val[index] + solve(index,W-weight[index],val,weight,dp);

       }

    return dp[index][W] = Math.max(take,notTake);



    }








}

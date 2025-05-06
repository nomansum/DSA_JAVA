import java.util.Arrays;

public class RodCuttingProblem {






    public static int cutRod(int price[], int n) {
        // Write your code here.
        int[][] dp = new int[price.length][n+1];
        for(int[] val:dp){
            Arrays.fill(val,-1);
        }
        return solve(price.length-1,n,price,dp);
    }




    public static int solve(int index,int N, int[] price,int[][] dp){

        if(index==0) return N*price[0];

        if(dp[index][N]!=-1) return dp[index][N];

        int notTake = 0+solve(index-1,N,price,dp);
        int take = Integer.MIN_VALUE;
        int rodLength  = index+1;
        if(rodLength<=N){
            take = price[index] + solve(index,N-rodLength,price,dp);
        }
        return dp[index][N] = Math.max(take,notTake);

    }





}

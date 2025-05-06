public class MatrixChainMultiplication {




    public static int matrixMultiplication(int[] arr , int N) {


int[][] dp = new int[N][N];

for(int i=N-1;i>=1;--i){
    for(int j=i+1;j<N;++j){

        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;++k){
            int steps = arr[i-1]*arr[k]*arr[j] + dp[i][k]+
                    dp[k+1][j];
            if(steps<min) min = steps;
        }
           dp[i][j] = min;
    }
}

return dp[1][N-1];

    }



public static int  solve(int i, int j, int[] arr, int[][] dp){

        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;++k){
            int steps = arr[i-1]*arr[k]*arr[j] + solve(i,k,arr,dp)+
                    solve(k+1,j,arr,dp);
            if(steps<min) min = steps;
        }
        return dp[i][j] = min;


}




}

public class CountSquareSubmatricesWithAllOnes {


    // https://leetcode.com/problems/count-square-submatrices-with-all-ones/description/
    public int countSquares(int[][] matrix) {


int[][] arr = matrix;
int[][] dp = new int[arr.length][arr[0].length];
int n = arr.length;
int m = arr[0].length;

        for (int j = 0; j < m; j++) dp[0][j] = arr[0][j];
        for (int i = 0; i < n; i++) dp[i][0] = arr[i][0];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) dp[i][j] = 0;
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],
                            Math.min(dp[i - 1][j - 1], dp[i][j - 1]));
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += dp[i][j];
            }
        }
        return sum;


    }







}

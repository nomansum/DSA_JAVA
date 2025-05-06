import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinimumCostToCutAString {



    // https://leetcode.com/problems/minimum-cost-to-cut-a-stick/description/
    public int minCost(int n, int[] cuts) {

        ArrayList<Integer> cutss = new ArrayList<>();
        for(int val:cuts) cutss.add(val);
        cutss.add(0);
        cutss.add(n);
        Collections.sort(cutss);
        int[][] dp = new int [cuts.length+1][cuts.length+1];
        for(int[] values:dp)Arrays.fill(values,-1);
       return f(1,cuts.length,cutss,dp);


    }

    public static int f(int i, int j, ArrayList<Integer> cuts, int[][] dp) {
        if (i > j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int mini = Integer.MAX_VALUE;

        for (int ind = i; ind <= j; ind++) {
            int ans = cuts.get(j + 1) - cuts.get(i - 1) +
                    f(i, ind - 1, cuts, dp) +
                    f(ind + 1, j, cuts, dp);

            mini = Math.min(mini, ans);
        }

        return dp[i][j] = mini;
    }









}

public class HouseRobber {

    //  https://leetcode.com/problems/house-robber/description/

    public static int rob(int[] nums) {

        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length-1];
        int[] dp1 = new int[nums.length-1];
        int[] temp = new int[nums.length-1];
        dp[0]=dp1[0] = -1;
        for(int i=1;i<dp.length;++i) {
            dp[i] = dp1[i] = -1;
            temp[i-1] = nums[i];
        }
        temp[temp.length-1] = nums[nums.length-1];
        solve(nums,dp,dp.length-1);
        solve(temp,dp1,dp1.length-1);
        return Math.max(dp[dp.length-1],dp1[dp1.length-1]);

    }

    public static int solve(int[] nums,int[] dp,int index){

        if(index==0) return dp[index] =  nums[0];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];

        int considerThis=nums[index] + solve(nums,dp,index-2);

        int notConsiderThis = 0 + solve(nums,dp,index-1);

        dp[index] = Math.max(considerThis,notConsiderThis);

        return dp[index];

    }


    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(rob(arr));

    }

}

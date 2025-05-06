public class MaximumSumCircularSubArray {




    public int maxSubarraySumCircular(int[] nums) {

        int maxSum = nums[0];
        int minSum = nums[0];
        int curMax = 0;
        int curMin = 0;

        int totalSum =0;
        for(int val:nums){

            curMax = Math.max(curMax+val,val);
            curMin = Math.min(curMin+val,val);
            maxSum = Math.max(maxSum,curMax);
            minSum = Math.min(minSum,curMin);
            totalSum += val;


        }

        return maxSum>0?Math.max(maxSum,totalSum-minSum):maxSum;


    }



}

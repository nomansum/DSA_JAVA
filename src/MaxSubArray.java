public class MaxSubArray {
//https://leetcode.com/problems/maximum-subarray
    public int maxSubArray(int[] nums) {
         int ans  = -100000000;
         int maxSumTillNow = -1000000;

         for(int val:nums){
             if((val+maxSumTillNow) > val){
                 maxSumTillNow += val;
             }
             else{
                 maxSumTillNow = val;
             }
             if(ans<maxSumTillNow){
                 ans = maxSumTillNow;
             }
         }

         return ans ;
    }

    public static void main(String[] args) {

     int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
     int[] arr1 = {1};
        System.out.println(new MaxSubArray().maxSubArray(arr1));

    }
}

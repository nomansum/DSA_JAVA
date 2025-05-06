public class BinarySubArraysWithSum {


    // https://leetcode.com/problems/binary-subarrays-with-sum/description/

    public static int numSubarraysWithSum(int[] nums, int goal) {
    return getCount(nums,goal) - getCount(nums,goal-1);
    }

    public static int getCount(int[] nums , int k){

        int l = 0 ;
        int r =0;
        int sum = 0;
        int maxSubArr = 0;
        while(r<nums.length){

            sum += nums[r];


            while(l<=r && sum>k){
                sum-=nums[l];
                ++l;
            }

            if(sum<=k){
                maxSubArr += (r-l+1);
            }
          r++;


        }
return maxSubArr;

    }


    public static void main(String[] args) {
           int[] arr = {0,0,0,0,0,0,1,0,0,0};

        System.out.println(numSubarraysWithSum(arr,0));

    }
}

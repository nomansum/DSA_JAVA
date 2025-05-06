public class MaxConsecutiveOnesThree {

    // https://leetcode.com/problems/max-consecutive-ones-iii/description/
    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int zeroes = 0;
        int maxLength = 0;

       while(right<nums.length){

           if(nums[right]==0)zeroes++;

           if(zeroes>k){
               if(nums[left]==0)zeroes--;
    left++;

           }
           if(zeroes<=k){
               maxLength = Math.max(maxLength,right-left+1);

           }

            right++;
       }
return maxLength;
    }


    public static void main(String[] args) {

        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
         int[] arrr = new int[10];
         for(int val : arrr){
             System.out.println(val);
         }
        System.out.println(longestOnes(arr,2));



    }
}

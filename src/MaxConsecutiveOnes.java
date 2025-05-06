public class MaxConsecutiveOnes {

   // https://leetcode.com/problems/max-consecutive-ones/

    public static int findMaxConsecutiveOnes(int[] nums) {

        int currentSum = 0;
        int maxSumTillNow = 0;
        for(int i=0;i<nums.length;++i){

            if(currentSum + nums[i] > currentSum){
                currentSum += nums[i];

            }
            else {
                maxSumTillNow = Math.max(maxSumTillNow,currentSum);
                currentSum = 0;
            }

        }
        maxSumTillNow = Math.max(maxSumTillNow,currentSum);


        return maxSumTillNow;
    }


    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));

    }
}

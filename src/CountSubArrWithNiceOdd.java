public class CountSubArrWithNiceOdd {

    //https://leetcode.com/problems/count-number-of-nice-subarrays/description/
    public static int numberOfSubarrays(int[] nums, int k) {
     return getCount(nums,k) - getCount(nums,k-1);
    }

    public static int getCount(int[] nums , int k){

        int l = 0;
        int r  = 0;
        int count = 0;
        int total = 0;

        while(r<nums.length){

            count += (nums[r]&1);

            while(l<=r && count>k){
                count  -= (nums[l] & 1);
                ++l;
            }

            if(count<=k){
                total += (r-l+1);
            }
            r++;

        }
return total;
    }

    public static void main(String[] args) {
       int[] arr = {1,1,2,1,1};
        System.out.println(numberOfSubarrays(arr,3));
    }
}

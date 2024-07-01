public class FindMinInRotatedSortedArray {
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/


    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int mid = -1;
        int minVal = Integer.MAX_VALUE;

        while(left<=right){

            mid = (left+right)/2;

            if(nums[left]<=nums[mid]){
                minVal = Math.min(minVal,nums[left]);
                left = mid+1;
            }
            else {
                minVal = Math.min(minVal,nums[mid]);
                right = mid-1;
            }



        }

       return  minVal;

    }



    public static void main(String[] args) {

        int[] arr = {4,5,6,7,1,2};
        System.out.println(findMin(arr));

    }
}

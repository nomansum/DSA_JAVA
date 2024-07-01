public class SearchInRotatedSortedArray2 {
//    https://leetcode.com/problems/search-in-rotated-sorted-array-ii/


    public static  boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid  = -1;

        while(left<=right){
            mid = (left+right)/2;

            if(nums[mid]==target){
                return true;
            }
            if(nums[left]==nums[mid] && nums[mid]==nums[right]){
                left++;
                right--;
                continue;
            }
            if(nums[mid]>=nums[left]){
                if(nums[left]<=target && nums[mid]>=target){
                    right = mid -1;

                }
                else {
                    left = mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[right]){
                    left = mid+1;

                }
                else right = mid -1;
            }

        }


        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(search(arr,5));

    }
}

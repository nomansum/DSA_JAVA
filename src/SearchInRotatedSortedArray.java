public class SearchInRotatedSortedArray {

    // https://leetcode.com/problems/search-in-rotated-sorted-array/description/

    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length -1;
        int idx = -1;

        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                idx = mid;
                break;
            }
            else if(nums[mid]>=nums[left]){
                if(nums[left]<=target && nums[mid]>=target){
                    right = mid-1;

                }
                else {
                    left = mid+1;
                }
            }
            else {
                if(nums[right]>=target && nums[mid]<=target){
                    left = mid+1;
                }
                else {
                    right = mid -1;
                }
            }

        }
        return idx ;
    }



    public static void main(String[] args) {
                   int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,2));
    }

}

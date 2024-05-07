public class SearchInsertPosition {
 // https://leetcode.com/problems/search-insert-position/description/
    public static int searchInsert(int[] nums, int target) {

      int start = 0;
      int end = nums.length-1;
      int mid = start;
      while(start<=end){
          mid = (start+end)/2;
          if(nums[mid] == target){
              return mid;
          }
         else if(nums[mid]<=target){
              start = mid+1;
          }
          else {
              end = mid - 1;
          }
      }
      return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};

        System.out.println(searchInsert(arr,5));
        System.out.println(searchInsert(arr,2));
        System.out.println(searchInsert(arr,7));
    }
}

public class BinarySearch {
   // https://leetcode.com/problems/binary-search/description/


    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length-1;
        int idx = -1;
        while(left<=right){
          int  mid = (left+right)/2;

            if(nums[mid]<target) left = mid+1;
            else if(nums[mid]>target)right = mid-1;
            else {
                idx = mid;
                break;
            }
        }
        return idx;

    }
    public int searchInsert(int[] nums, int target) {
          int left = 0;
          int right = nums.length-1;

          while(left<=right){
             int mid = (left+right)/2;
              if(nums[mid]<=target){
                  left = mid+1;

              }
              else{
                  right = mid-1;

              }
          }

          return right;
    }


    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int[] arr1 = {1,3,3,5,6};
                 BinarySearch bs = new BinarySearch();
        System.out.println(bs.searchInsert(arr1,3));
    }




}

public class FirstAndLastOccur {

    // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

    public static int[] searchRange(int[] nums, int target) {

        int firstPos = findFirstPosition(nums,target);
        int lastPos = findLastPosition(nums, target);


        return new int[] {firstPos,lastPos};

    }
public static int findFirstPosition(int[] nums , int target){
        int left = 0;
        int right = nums.length-1;
        int idx = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                idx = mid;
                right = mid-1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return idx;
}

    public static int findLastPosition(int[] nums , int target){
        int left = 0;
        int right = nums.length-1;
        int idx = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                idx = mid;
                left = mid+1;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return idx;
    }



    public static void main(String[] args) {

        int[] arr = {1,3,3,8,8,8,9,9,10,11,12};
     int[] newArr = searchRange(arr,12);
        System.out.println(newArr[0]);
        System.out.println(newArr[1]);


    }
}

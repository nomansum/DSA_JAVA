public class PeakElement {
    // https://leetcode.com/problems/find-peak-element/description/
    public static int findPeakElement(int[] nums) {

        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }

        int left = 1;
        int right = nums.length -2;
        int mid =-1;
        while(left<=right){
            mid = (left+right)/2;


            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }

            else if( nums[mid-1]<nums[mid] ){
                left = mid+1;
            }
            else if(nums[mid+1]<nums[mid]){
                right = mid-1;
            }
            else {
                left = mid+1;
            }



        }


return 0;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(findPeakElement(arr));
    }




}

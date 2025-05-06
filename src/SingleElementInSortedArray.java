public class SingleElementInSortedArray {

    // https://leetcode.com/problems/single-element-in-a-sorted-array/description/

    public static int singleNonDuplicate(int[] nums) {

        int low = 1;
        int high = nums.length -2;
        int mid =0;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        while(low<=high){

            mid = ( low + high )/2;

            if(nums[mid]!= nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if( (((mid&1)==1) && nums[mid]==nums[mid-1]) || ((mid%2==0) && nums[mid]==nums[mid+1]) ){
                low = mid  +1 ;
            }
            else {
                high  = mid -1;
            }


        }

        return nums[mid];
    }



    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleNonDuplicate(arr));

    }

}

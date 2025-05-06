public class SearchInRotatedSOrtedArrayPractice {



    public  int search(int[] nums,int target){


        int left = 0;
        int right = nums.length-1;
        int idx = -1;

        while(left<=right){

            int mid = (left+right)/2;
            if(nums[mid]==target){
                idx = mid;
                break;
            }
            else if(nums[mid]>=nums[left]){
                if(nums[mid]>=target && nums[left]<=target){
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
                else right = mid -1;
            }


        }

        return idx;

    }


}

public class ArrayIsSortedAndRotated {
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

    public static boolean check(int[] nums) {

        int count = 0;
        for(int i=0;i<nums.length-1;++i){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(nums[0]<nums[nums.length-1]){
            count++;
        }

        return count<=1;

    }



    public static boolean checkOptimal1(int[] nums) {
        int i=1;
        int j = 0;
        int n = nums.length;
        while(i <n && nums[i-1]<=nums[i]){
            ++i;
        }
        for(;j<n-1;++j){
            if(nums[i%n]>nums[(i+1)%n]){
                return false;
            }
            i++;
        }
        return true;
    }



    public static void main(String[] args) {
     int[] arr = {5,5,6,6,6,9,1,2};

        System.out.println(check(arr));


    }
}

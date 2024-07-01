public class RearrangeArrayElementsBySign {

//https://leetcode.com/problems/rearrange-array-elements-by-sign/
    public static int[] rearrangeArray(int[] nums) {

         int positivePointer = 0;
         int negativePointer = 1;
        int[] ans = new int[nums.length];
        for(int val : nums){
            if(val<0){
                ans[negativePointer] = val;
                negativePointer += 2;
            }
            else{
                ans[positivePointer] = val;
                positivePointer += 2;
            }
        }
return ans;
    }

     public  static void swap (int[] nums , int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
     }



    public static void main(String[] args) {
         int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);
         MergeSort.printArray(ans);

    }
}

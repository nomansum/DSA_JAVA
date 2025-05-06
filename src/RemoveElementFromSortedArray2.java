public class RemoveElementFromSortedArray2 {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for(int i=2;i<nums.length;++i){
            if(nums[i]!=nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

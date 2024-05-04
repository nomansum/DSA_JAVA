public class SingleNumber {
//https://leetcode.com/problems/single-number/description/
    public int singleNumber(int[] nums) {
         int ans = nums[0];

         for(int i = 1;i<nums.length;++i){
             ans ^= nums[i];
         }

         return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1};
     SingleNumber solution = new SingleNumber();
        System.out.println(solution.singleNumber(arr));
    }
}

import java.util.Arrays;

public class ProductOfAnArrayWithoutSelf {







    // https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150
    public int[] productExceptSelf(int[] nums) {




        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        for(int i=1;i<nums.length;++i){

         ans[i] = ans[i-1]*nums[i-1];

        }

        int suffix = 1;
        for(int i=nums.length-1;i>=0;--i){
            ans[i] *= suffix;
            suffix *= nums[i];
        }
return ans;

    }







}

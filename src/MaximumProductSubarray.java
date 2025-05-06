public class MaximumProductSubarray {
// https://leetcode.com/problems/maximum-product-subarray/description/


    public static  int maxProduct(int[] nums) {

        double  prefixProduct = 1;
        double  suffixProduct = 1;
        double  maxProductValue = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;++i){
            if(prefixProduct == 0 ) prefixProduct = 1;
            if(suffixProduct == 0) suffixProduct = 1;

            prefixProduct =  prefixProduct * (double) nums[i];
            suffixProduct = suffixProduct * (double)nums[nums.length-i-1];
            maxProductValue = Math.max(maxProductValue,Math.max(prefixProduct,suffixProduct));

        }
  return (int)maxProductValue;
    }



    public static void main(String[] args) {
           int[] arr = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProduct(arr));
    }
}

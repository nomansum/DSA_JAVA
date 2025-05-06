public class MaximumProductOfThreeNumbers {



    public int maximumProduct(int[] nums) {

        int min1 ,min2,max1,max2,max3;
        min1=min2 = Integer.MAX_VALUE;
        max2=max1=max3 = Integer.MIN_VALUE;

        for(int val:nums){


            if(max1<val){
                max3 = max2;
                max2 = max1;
                max1 = val;
            }
            else if(max2<val){
                max3 = max2;
                max2 = val;
            }
            else if(max3<val){
                max3 = val;
            }
            if(min1>val){
                min2 = min1;
                min1 = val;
            }
            else if(min2>val){
                min2 = val;
            }


        }
        return Math.max(max1*max2*max3 , max1*min1*min2);



    }





}

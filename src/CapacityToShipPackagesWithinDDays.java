public class CapacityToShipPackagesWithinDDays {
    // https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/



    public static int shipWithinDays(int[] weights, int days) {
    int[] arr = findMaxAndSum(weights);
    int left = arr[0];
    int right = arr[1];
        int requiredCapacity = -1;
        int mid = -1;

        while(left<=right){
            mid = (left+right)/2;
            if(isValid(weights,mid,days)){
                requiredCapacity = mid;
                right = mid -1;
            }
            else {
                left = mid+1;
            }


        }

  return requiredCapacity;

    }
    public static boolean isValid(int[] nums,int capacity, int days){
        int totalWeights = 0;

        for(int i=0;i<nums.length;++i){

            if(totalWeights+nums[i]>capacity){
                totalWeights = nums[i];
                days--;
            }
            else {
                totalWeights += nums[i];
            }

        }
       days--;
        return days>=0?true:false;
    }

    public static int[] findMaxAndSum(int[] nums){
        int sum = 0;
        int maxElement = Integer.MIN_VALUE;
        for(int val:nums){
            sum+=val;
            maxElement = Math.max(maxElement,val);
        }

        return new int[] {maxElement,sum};

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }
}

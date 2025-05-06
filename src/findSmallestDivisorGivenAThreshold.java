public class findSmallestDivisorGivenAThreshold {
    // https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
    public static int smallestDivisor(int[] nums, int threshold) {


        int left = 1;
    int right = findHigh(nums);
    int ans = -1;
    int mid = -1;
    while(left<=right){
        mid = (left+right)/2;
        if(isValid(nums,mid,threshold)){
            ans = mid;
            right = mid-1;
        }
        else{
            left = mid+1;
        }

    }
    return ans;
    }

    public static boolean isValid(int[] nums,int divisor,int threshold){
        int sum = 0;
        for(int val:nums){
            sum += Math.ceilDiv(val,divisor);
        }
        return sum<=threshold?true:false;

    }




    public static int findHigh(int[] nums){
        int maxElement = Integer.MIN_VALUE;
        for(int value : nums){
            maxElement = Math.max(value,maxElement);
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};

        System.out.println(smallestDivisor(arr,5));
    }
}

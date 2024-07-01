public class SplitArrayLargestSum {
    // https://leetcode.com/problems/split-array-largest-sum/description/
    public static int splitArray(int[] nums, int k) {

    int[] arr = findMaxAndSum(nums);
    int left = arr[0];
    int right = arr[1];

    while (left<=right){
        int mid = (left+right)/2;
        int count = findMaxSubArray(nums,mid);
        if(count>k){
            left = mid+1;

        }
        else {
            right = mid -1;
        }

    }

return  left;

    }

    public static int findMaxSubArray(int[] nums,int sum){
    int subArrayCount = 1;
    int sumOfSubArray = 0;
    for(int val:nums){
        if(sumOfSubArray + val <= sum){
            sumOfSubArray += val;
        }
        else{
            subArrayCount+=1;
            sumOfSubArray = val;
        }

    }

return subArrayCount;
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
       int[] arr = {7,2,5,10,8};
        System.out.println(splitArray(arr,2));

    }
}

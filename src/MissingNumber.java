public class MissingNumber {

//https://leetcode.com/problems/missing-number/


    public static int missingNumber(int[] nums) {

        int missingNumber  = (nums.length * (nums.length+1))/2;
        for(int val : nums){
            missingNumber -= val;
        }

        return missingNumber;
    }


    public static void main(String[] args) {

        int[] arr = {9,6,4,2,3,5,7,0,1};
        int[] arr1 = {0,1};
        System.out.println(missingNumber(arr));

    }
}

public class MBouquets {

    // https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
    public static int minDays(int[] bloomDay, int m, int k) {

        if((m*k)>bloomDay.length)return -1;

        int[] arr = findLowHigh(bloomDay);

        int left = arr[1];
        int right = arr[0];
        int ans = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(isValid(bloomDay,mid,m,k)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return ans;
    }


     public static boolean isValid(int[] nums,int day,int bouquets,int k){

        int count = 0;
        int noOfBouquets = 0;

        for(int val:nums){
            if(val<=day){
                count++;
            }
            else{
                noOfBouquets += (count/k);
                count=0;
            }
        }

         noOfBouquets += (count/k);

        return noOfBouquets>=bouquets?true:false;
     }

    public static int[] findLowHigh(int[] nums){
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        for(int value : nums){
            maxElement = Math.max(value,maxElement);
            minElement = Math.min(value,minElement);
        }
        return new int[] {maxElement,minElement};
    }

    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};

        System.out.println(minDays(arr,3,2));


    }

}

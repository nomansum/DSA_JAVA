public class KokoEatingBananas {
    // https://leetcode.com/problems/koko-eating-bananas/description/

    public static int minEatingSpeed(int[] piles, int h) {

    int low = 0;
    int high = findMax(piles);
    int ans = -1;
    int hours = -1;
   while(low<=high){
       int possibleAns = (low+high)/2;
       hours = calculateTotalHours(piles,possibleAns);
       if(hours<=h){
           ans = possibleAns;
           high = possibleAns-1;
       }
       else{
           low = possibleAns +1;
       }
   }
return ans;

    }
    public static int calculateTotalHours(int[] nums,int capacity){
        int totalHours = 0;
        for(int value : nums){
            totalHours += Math.ceil((double)value/capacity);

        }
        return totalHours;
    }
    public static int findMax(int[] nums){
        int maxElement = Integer.MIN_VALUE;
        for(int value : nums){
            maxElement = Math.max(value,maxElement);
        }
        return maxElement;
    }



    public static void main(String[] args) {
      int[] arr ={3,6,7,11};
        System.out.println(minEatingSpeed(arr,8));


    }

}

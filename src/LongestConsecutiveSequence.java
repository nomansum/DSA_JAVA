import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
// https://leetcode.com/problems/longest-consecutive-sequence/




    public static int longestConsecutive(int[] nums) {
             if(nums.length==0)return 0;

             int longestSequence = 1;
             Set<Integer> set = new HashSet<>();

             for(int i=0;i<nums.length;++i){
                 set.add(nums[i]);
             }

             for(int val:set){
                 if(set.contains(val-1)==false){
                     int count = 1;
                     int currentValue = val;
                     while(set.contains(currentValue+1)){
                         currentValue++;
                         count++;

                     }
                     longestSequence = Math.max(longestSequence,count);
                 }
             }

return longestSequence;
    }

    public static void main(String[] args) {

        int[] arr = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}

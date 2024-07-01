import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MajorityElement {
//https://leetcode.com/problems/majority-element/description/


// OPTIMAL :::  Moore's Voting Algorithm


    public static int majorityElement(int[] nums) {

        int val = nums[0];
        int count = 0;
        for(int value:nums){
            if(val == value){
                count++;
            }
            else if(count == 0){
                val = value;
            }
            else {
                count--;
            }

        }
        return val;

    }






    public static int majorityElementBetter(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
     int ans = -1;
        for ( int i =0;i<nums.length;++i){
            if(map.get(nums[i])!=null){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = it.next();
            if(map.get(key) >( nums.length / 2)){
                ans = key;
            }
        }
return ans;

    }

    public static void main(String[] args) {
          int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}

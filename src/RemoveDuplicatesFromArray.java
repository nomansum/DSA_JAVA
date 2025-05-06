import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicatesFromArray {

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public static int removeDuplicates(int[] nums) {

       int index = 0;
       for(int i=1;i<nums.length;++i){
           if(nums[index]!=nums[i]){
               nums[++index] = nums[i];
           }
       }
        return index+1;
    }
    public static int removeDuplicatesInefficient(int[] nums) {

        Set<Integer> s = new HashSet<>();
        for(int val : nums){
            s.add(val);
        }




        return s.size();
    }

    public static void main(String[] args) {
      int[] arr = {1,1,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3};

        System.out.println(removeDuplicates(arr));

        for(int val : arr){
            System.out.println(val);
        }

    }
}

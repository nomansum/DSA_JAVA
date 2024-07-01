

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbersInEfficient(int[] nums) {

        HashMap<Integer , Boolean> hashmap = new HashMap<>();
        List<Integer> disappearedNumbers  = new ArrayList<>();

        int n = nums.length;

        for(int val:nums){
            hashmap.put(val,true);
        }
        for(int i=1;i<=n;++i){
            if(hashmap.get(i)==null){
                disappearedNumbers.add(i);
            }
        }

return disappearedNumbers;

    }
    public static List<Integer> findDisappearedNumbersMoreEfficient(int[] nums) {
         boolean[] mark = new boolean[nums.length+1];
        //System.out.println(mark[1]);
        List<Integer> disappearedNumbers  = new ArrayList<>();
        for(int i = 0 ;i<nums.length;++i){
            mark[nums[i]] = true;
        }
        for(int i =1;i<=nums.length;++i){
            if(!mark[i]){
                disappearedNumbers.add(i);
            }
        }

    return disappearedNumbers;
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> disappearedNumbers  = new ArrayList<>();

        int n;// = nums.length;
        int len = nums.length;
        for(int i=0;i<len;++i){
            n = Math.abs(nums[i]);
            if(nums[n-1]>0) {
                nums[n - 1] *= -1;
            }
        }
        for(int i = 0;i<len;++i){
            if(nums[i]>0){
                disappearedNumbers.add(i+1);
            }
        }

        return disappearedNumbers;
    }

    public static void main(String[] args) {
   int[] nums = {1,1};
   List<Integer> list = findDisappearedNumbers(nums);
   for(Integer val:list){
       System.out.println(val);
   }
    }
}

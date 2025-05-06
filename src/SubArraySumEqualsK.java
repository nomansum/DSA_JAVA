import java.util.HashMap;

public class SubArraySumEqualsK {
    // https://leetcode.com/problems/subarray-sum-equals-k/description/
    public static int subarraySum(int[] nums, int k) {
      int totalNumOfSubarray = 0;
      int total = 0;
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    for(int value:nums){
        total+=value;
        if(map.get(total - k)!=null){
            totalNumOfSubarray += map.get(total - k);
        }
        map.put(total,map.get(total)==null?1:map.get(total)+1);
    }
      return  totalNumOfSubarray;
    }

    public static void main(String[] args) {
         int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        System.out.println(subarraySum(arr,3));
    }
}

import java.util.HashMap;

// https://leetcode.com/problems/two-sum/

public class TWOSUM {


    public int[] twoSum(int[] nums, int target) {

        int[] solution = new int[2];
  HashMap<Integer,Integer> hashMap = new HashMap<>();

  for(int i =0;i<nums.length;++i){


      if(hashMap.get(nums[i])==null){
          hashMap.put(nums[i],i);

      }

      if(hashMap.get(target-nums[i])!=null && hashMap.get(target-nums[i])!=i){
          solution[0] = i;
          solution[1] = hashMap.get(target-nums[i]);
          if(solution[0]>solution[1]){
              int temp = solution[0];
              solution[0] = solution[1];
              solution[1] = temp;

          }
          break;
      }
  }

  return solution;
    }



    public static void main(String[] args) {
        HashMap<String,String> hashmap = new HashMap<>();
        hashmap.put("as","ds");
         int[] arr = {3,3};
       TWOSUM twosum = new TWOSUM();
    int[] solution =    twosum.twoSum(arr,6);

    for(int val:solution){
        System.out.println(val);
    }

    }
}

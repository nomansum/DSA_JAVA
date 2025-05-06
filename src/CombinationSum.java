import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    // https://leetcode.com/problems/combination-sum/description/
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

List<List<Integer>> combinations = new ArrayList<>();

List<Integer> list = new ArrayList<>();

recurse(0,candidates,target,combinations,list);

return combinations;

    }

    public static void recurse(int index,int[] candidates,int target,List<List<Integer>> combinations,List<Integer>list){

      if(index==candidates.length){
          if(target==0){
              combinations.add(new ArrayList<>(list));
          }
          return;
      }

      if(candidates[index]<=target){
          list.add(candidates[index]);
          recurse(index,candidates,target-candidates[index],combinations,list);
          list.removeLast();
      }

      recurse(index+1,candidates,target,combinations,list);



    }


    public static void main(String[] args) {

        int[] nums = {2,3,5};

        List<List<Integer>> l = combinationSum(nums,8);

        for(List<Integer> a: l){
            for(Integer val:a){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println(l.size());

    }
}

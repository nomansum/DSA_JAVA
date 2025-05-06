import java.util.*;

public class CombinationSum2 {


    // https://leetcode.com/problems/combination-sum-ii/description/
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
         Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(candidates);
        recurse(0,candidates,target,set,list);

        return set.stream().toList();
    }
    public static void recurse(int index,int[] candidates,int target,Set<List<Integer>> combinations,List<Integer>list){

        if(target==0){
            combinations.add(new ArrayList<>(list));
            return;
        }
        if(index>=candidates.length){
            return;
        }
        for(int i=index;i<candidates.length;++i){

            if(i>index && candidates[i]==candidates[i-1])continue;

            if(candidates[i]>target)break;

            list.add(candidates[i]);
            recurse(i+1,candidates,target-candidates[i],combinations,list);
            list.removeLast();


        }


    }


    public static void main(String[] args) {

        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

        List<List<Integer>> l = combinationSum2(nums,8);

        for(List<Integer> a: l){
            for(Integer val:a){
                System.out.print(val+" ");
            }
            System.out.println();
        }
       // System.out.println(l.size());


    }

}

import java.util.*;

public class Subsets2 {

    // https://leetcode.com/problems/subsets-ii/description/
    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        Set<List<Integer>> subsets = new HashSet<>();

        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        generateSubsets(subsets,nums,0,list);
      return  subsets.stream().toList();

    }

    public static void generateSubsets(Set<List<Integer>> subsets,int[] nums,int index,List<Integer>list){


        if(index==nums.length){
            subsets.add(new ArrayList<>(list));
            return;
        }

     for(int i=index;i<nums.length;++i){
         if(i>index && nums[i]==nums[i-1])continue;
         list.add(nums[i]);
         generateSubsets(subsets,nums,i+1,list);
         list.removeLast();
         generateSubsets(subsets,nums,i+1,list);

     }

    }


    public static void main(String[] args) {

         int[] nums  = {1,2,2};
        List<List<Integer>> l = subsetsWithDup(nums);

        for(List<Integer> a: l){
            for(Integer val:a){
                System.out.print(val+" ");
            }
            System.out.println();
        }



    }
}

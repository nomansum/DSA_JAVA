import java.util.ArrayList;
import java.util.List;

public class Subsets {
    // https://leetcode.com/problems/subsets/description/
    public static List<List<Integer>> subsets(int[] nums) {
  List<List<Integer>> subsetsList = new ArrayList<>();
   List<Integer>list = new ArrayList<>();
      generateSubsets(0,nums,list,subsetsList);
     return subsetsList;
    }

    public static void generateSubsets(int index , int[] nums,List<Integer> list,List<List<Integer>>subsetsList){

        if(index == nums.length){
          List<Integer> l = new ArrayList<>();
          for(Integer val:list){
              l.add(val);
          }
            subsetsList.add(l);
            return;
        }

        list.add(nums[index]);
        generateSubsets(index+1,nums,list,subsetsList);
        list.removeLast();
        generateSubsets(index+1, nums,list,subsetsList);


    }


    public static void main(String[] args) {
       int[] nums = {1,2,3};
        List<List<Integer>> l = subsets(nums);

        for(List<Integer> a: l){
            for(Integer val:a){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println(l.size());

    }
}

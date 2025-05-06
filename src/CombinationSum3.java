import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum3 {

    // https://leetcode.com/problems/combination-sum-iii/description/
    public static List<List<Integer>> combinationSum3(int k, int n) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    Set<List<Integer>> combinations = new HashSet<>();
   List<Integer> list = new ArrayList<>();
   generateCombinations(combinations,list,k,n,arr,0);
     return  combinations.stream().toList();
    }

    public static void generateCombinations(Set<List<Integer>> combinations,List<Integer> list,int k , int n , int[] nums,int index){

    if(list.size()== k && n==0){
        combinations.add(new ArrayList<>(list));
        return;
    }
    if(index>=nums.length){
        return;
    }

    for(int i=index ; i<nums.length;++i){

       if(i>index && nums[i]==nums[i-1])continue;
       if(nums[i]>n)break;


            list.add(nums[i]);
            generateCombinations(combinations,list,k,n-nums[i],nums,i+1);
            list.removeLast();

        generateCombinations(combinations,list,k,n,nums,i+1);


    }



    }


    public static void main(String[] args) {
    List<List<Integer>> list = combinationSum3(3,9);

    for(List<Integer> a: list){
        for(Integer b: a){
            System.out.println(b+" ");
        }
        System.out.println();
    }

    }
}

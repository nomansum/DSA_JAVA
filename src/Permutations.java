import java.util.*;
import  java.io.*;

public class Permutations {


    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> permutations = new ArrayList<>();
      // HashSet<Integer> hashes = new HashSet<>();
        HashMap<Integer,Boolean> flag = new HashMap<>();
        List<Integer> list = new ArrayList<>();
       backtrack(permutations,flag,nums,list);
       return  permutations;
    }


    public void backtrack(List<List<Integer>>permutations,HashMap<Integer,Boolean> flag , int[] nums,List<Integer> list){

        if(list.size()==nums.length){
            permutations.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;++i){


            if(flag.get(nums[i])!=null && flag.get(nums[i])==true) continue;
               flag.put(nums[i],true);
            list.add(nums[i]);


            backtrack(permutations,flag,nums,list);
             flag.put(nums[i],false);
            list.remove(list.size()-1);
        }


    }








}

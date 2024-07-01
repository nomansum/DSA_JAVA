import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumProblem {


    // https://leetcode.com/problems/4sum/description/


    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> quadruplets = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;++i) {

            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j = i+1;j<nums.length;++j){
                if(j>i+1 && nums[j]==nums[j-1])continue;

                int k = j+1;
                int l = nums.length-1;

                while(k<l){
                    long sum =0;
                    sum +=nums[i];
                    sum+= nums[j];
                    sum+= nums[k] ;
                    sum+= nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[j]);
                        quadruplet.add(nums[k]);
                        quadruplet.add(nums[l]);
                        quadruplets.add(quadruplet);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1])k++;
                        while(k<l && nums[l]==nums[l+1])l--;
                    }
                }

            }

        }


        return  quadruplets;
    }



    public static void main(String[] args) {
        int[] arr = {1000000000,1000000000,1000000000,1000000000};
        int sum =0;
        for(Integer val:arr){
            sum += val;
        }
        System.out.println("val " + sum);
        List<List<Integer>> quadruplets = fourSum(arr,-294967296);
        for(List<Integer> values:quadruplets){
            for(Integer val:values){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }



}

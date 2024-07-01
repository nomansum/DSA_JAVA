import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://leetcode.com/problems/3sum/
public class ThreeSumProblem {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();

        for(int i=0;i<nums.length;++i){

            if(i>0 && nums[i]==nums[i-1])continue;
            int j = i+1;
            int k = nums.length -1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    j++;
                }
                else if (sum>0){
                    k--;
                }
                else{
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    triplets.add(triplet);
                    k--;
                    j++;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;

                }
            }

        }

return triplets;


    }



    public static void main(String[] args) {
        int[] arr = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> triplets = threeSum(arr);
        for(List<Integer> values:triplets){
            for(Integer val:values){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {



    // https://leetcode.com/problems/largest-divisible-subset/description/
    public List<Integer> largestDivisibleSubset(int[] nums) {


        int maxi = 0;
        int lastIndex = 0;

        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();
        int[] hash = new int[nums.length+1];
        int[] dp = new int[nums.length+1];
        //Arrays.fill(dp,-1);
        for(int i=0;i<nums.length;++i){

            hash[i] = i;

            for(int prev = 0;prev<i;prev++){

                if(nums[i]%nums[prev]==0 && (1+dp[prev])>dp[i]){
                    dp[i] = 1+dp[prev];
                    hash[i] =  prev;
                }

            }
            if(dp[i]>maxi){
                maxi=dp[i];
                lastIndex=i;
            }

        }

        result.add(nums[lastIndex]);
        while(hash[lastIndex]!=lastIndex){
            lastIndex=hash[lastIndex];
            result.add(nums[lastIndex]);
        }
      return  result.reversed();

    }








}

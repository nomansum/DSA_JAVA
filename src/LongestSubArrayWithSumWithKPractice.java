import java.util.HashMap;

public class LongestSubArrayWithSumWithKPractice {




    // https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
    public static int longestSubarrayWithSumK(int []a, long k) {


        int n = a.length;
        long sum = 0;
        HashMap<Long,Integer> mp = new HashMap<>();
        int maxLength = -1;
        for(int i=0;i<n;++i){

            sum+=a[i];

            if(sum==k){
                maxLength = Math.max(i+1,maxLength);
            }

            long remainingPortion = sum-k;

            if(mp.containsKey(remainingPortion)){
                int len = i-mp.get(remainingPortion)+1;
                maxLength= Math.max(len,maxLength);
            }

            if(mp.containsKey(sum)==false){
                mp.put(sum,i);
            }

        }

   return maxLength;

    }


    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        System.out.println(longestSubarrayWithSumK(a,k));
    }






}

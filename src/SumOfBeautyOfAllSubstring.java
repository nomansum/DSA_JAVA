import java.util.Arrays;
import java.util.Iterator;

public class SumOfBeautyOfAllSubstring {
    // https://leetcode.com/problems/sum-of-beauty-of-all-substrings/description/



    public static int beautySum(String s) {


        int n = s.length();
        int result = 0;
        for(int i=0;i<n;++i){

            int[] frequencies = new int[26];

            for(int j = i;j<n;++j){

                frequencies[s.charAt(j)-'a']++;

                result += calculateBeauty(frequencies);

            }



        }

return result;

    }

    public static int calculateBeauty(int[] frequencies){
        int maxVal = 0;
        int minVal = Integer.MAX_VALUE;
        for(int val:frequencies){
            maxVal = Math.max(maxVal,val);
          if(val>0)  minVal = Math.min(minVal,val);
        }
        return maxVal - minVal;
    }

    public static void main(String[] args) {
        System.out.println(beautySum("aabcbaa"));
    }
}

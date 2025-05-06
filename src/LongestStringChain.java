import java.util.Arrays;
import java.util.Comparator;

public class LongestStringChain {





    // https://leetcode.com/problems/longest-string-chain/description/
    public int longestStrChain(String[] words) {

         int[] dp = new int [words.length+1];
        Arrays.fill(dp,1);
        int result = 1;
     Arrays.sort(words, (a,b)->  Integer.compare(a.length(),b.length()));
        for(int i=0;i<words.length;++i){

            for(int prev = 0;prev<i;++prev){

                if(checkPossibility(words[i],words[prev]) && (1+dp[prev])>dp[i] ){
                    dp[i]=1+dp[prev];
                }

            }
            if(dp[i]>result){
                result = dp[i];
            }

        }
return result;


    }

public boolean checkPossibility(String s1, String s2){
    if (s1.length() != s2.length() + 1) {
        return false;
    }

    int first = 0;
    int second = 0;

    while (first < s1.length()) {
        if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
            first++;
            second++;
        } else {
            first++;
        }
    }

    return first == s1.length() && second == s2.length();
}



}

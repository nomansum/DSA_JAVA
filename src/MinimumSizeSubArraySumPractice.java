import java.util.*;

public class MinimumSizeSubArraySumPractice {


    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int left = 0;

        Map<Character,Integer> lastSeen = new HashMap<>();

        for(int right = 0;right<s.length();++right){

            char c = s.charAt(right);
            if(lastSeen.containsKey(c) && lastSeen.get(c)>=left){
                left = lastSeen.get(c)+1;
            }
            maxLength = Math.max(maxLength,right-left+1);
            lastSeen.put(c,right);

        }

        return maxLength;


    }


    public String convert(String s, int numRows) {

          if(numRows==1) return s;
          StringBuilder sb = new StringBuilder();
          for(int r=0;r<numRows;++r){

              int increment = (numRows-1)*2;

              for(int i=r;i<s.length();i+=increment){

                  sb.append(s.charAt(i));
                  if(r>0 && r<(numRows-1) && (i+increment-r-r)<s.length()){
                      sb.append(s.charAt(i+increment-r-r));
                  }

              }


          }

        return sb.toString();
    }


}

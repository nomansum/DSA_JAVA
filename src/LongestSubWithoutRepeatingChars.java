import java.util.HashMap;

public class LongestSubWithoutRepeatingChars {
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/


    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        HashMap<Character,Integer> map = new HashMap<>();

       int left= 0;
       int right = 0;

       while(right<s.length()){

           if(!map.containsKey(s.charAt(right))){

               map.put(s.charAt(right),right);


           }
           else {
               left = map.get(s.charAt(right))<left?left:map.get(s.charAt(right)) + 1;

            //   if(map.get(s.charAt(right))>left)

               map.remove(s.charAt(right));
               map.put(s.charAt(right),right);
           }
           maxLength = Math.max(maxLength,right-left+1);
          // System.out.println(maxLength);
           right++;

       }

return maxLength;

    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }

}

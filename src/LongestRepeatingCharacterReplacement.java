public class LongestRepeatingCharacterReplacement {
    // https://leetcode.com/problems/longest-repeating-character-replacement/description/
    public static int characterReplacement(String s, int k) {

        int l = 0;
        int r  = 0;
        int maxFreq = 0;
        int maxLen = 0;
        int[] arr = new int[26];

        while (r<s.length()){

            arr[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,arr[s.charAt(r)-'A']);

            if((r-l+1)-maxFreq > k){
                arr[s.charAt(l)-'A']--;
                l++;

            }

            if((r-l+1)-maxFreq<=k){
                maxLen = Math.max(maxLen,r-l+1);
            }

             r++;


        }

return maxLen;

    }


    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB",2));
    }
}

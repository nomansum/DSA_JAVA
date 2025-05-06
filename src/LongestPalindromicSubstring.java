public class LongestPalindromicSubstring {
    // https://leetcode.com/problems/longest-palindromic-substring/description/


    public static String longestPalindrome(String s) {

        String lps = "";
        int lpsLength = 0;
        int n = s.length();
        for(int i=0;i<n;++i){

            int left = i;
            int right = i;

            while(left>=0 && right<n){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                left--;
                right++;
            }

            String temp = s.substring(left+1,right);

            if(temp.length()>lps.length()){
                lps = temp;
            }

            left = i - 1;
            right = i;

            while(left>=0 && right<n){
                if(s.charAt(left)!=s.charAt(right)){
                    break;
                }
                left--;
                right++;
            }

             temp = s.substring(left+1,right);

            if(temp.length()>lps.length()){
                lps = temp;
            }


        }

return lps;


    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}

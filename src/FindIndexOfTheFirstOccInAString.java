public class FindIndexOfTheFirstOccInAString {



    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
    public int strStr(String haystack, String needle) {

     //   int startingIndex = 0;

        int len = needle.length();

        int  j = 0;

        if(haystack.length()<len) return -1;

        for(int i=0;i<haystack.length();++i){
            for( j=0;j<len;++j){
                if((i+j)>(haystack.length()-1))break;
                if(haystack.charAt(i+j)!=needle.charAt(j))break;

            }
            if(j==len) {
                return i;
            }
        }

        return -1;
    }









}

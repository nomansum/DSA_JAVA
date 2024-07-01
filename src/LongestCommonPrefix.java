import java.util.Arrays;

public class LongestCommonPrefix {

    // https://leetcode.com/problems/longest-common-prefix/description/
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        int n = strs.length-1;
        int m = strs[0].length();
       for(int i=0;i<m;++i){
           if(strs[0].charAt(i) != strs[n].charAt(i)){
               return prefix.toString();
           }
           prefix.append(strs[0].charAt(i));
       }

return prefix.toString();

    }
    public  String longestCommonPrefixBF(String[] strs) {

        StringBuilder prefix = new StringBuilder();

        for(int i=0;i<strs[0].length();++i){

            for(String word:strs){
                if (i==word.length() || word.charAt(i)!=strs[0].charAt(i)){
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i));

        }

        return prefix.toString();

    }

    public static void main(String[] args) {

        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));

    }







}

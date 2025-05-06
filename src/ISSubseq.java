public class ISSubseq {


    // https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
    public boolean isSubsequence(String s, String t) {

       int sPointer =0;
       for(int i=0;i<t.length();++i){

           if(sPointer<s.length() && t.charAt(i)==s.charAt(sPointer))sPointer++;

       }
        return sPointer==s.length();

    }



}

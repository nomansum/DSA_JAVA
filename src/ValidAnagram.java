public class ValidAnagram {

    // https://leetcode.com/problems/valid-anagram/description/


    public boolean isAnagram(String s, String t) {


          int[] mark = new int[200];
          for(int i= 0 ;i<s.length();++i){
              mark[s.charAt(i)]++;
          }
          for(int i=0;i<t.length();++i){
              mark[t.charAt(i)]--;
          }
          for(int i = 0;i<200;++i){
              if(mark[i]!=0)return false;
          }

        return true;
    }



    public static void main(String[] args) {


    }
}

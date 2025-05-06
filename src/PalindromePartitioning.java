import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    // https://leetcode.com/problems/palindrome-partitioning/description/

    public static List<List<String>> partition(String s) {
      List<List<String>> palindromes = new ArrayList<>();
      List<String> tracks = new ArrayList<>();
      makePartitions(0,palindromes,s,tracks);
      return palindromes;

    }


    public static void makePartitions(int index,List<List<String>>res,String s , List<String> tracks){

        if(index==s.length()){
            res.add(new ArrayList<>(tracks));
            return;
        }

        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index,i)){
                tracks.add(s.substring(index,i+1));
                makePartitions(i+1,res,s,tracks);
                tracks.removeLast();
            }
        }




    }

    public static boolean isPalindrome(String s,int left, int right){

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
return true;
    }

    public static void main(String[] args) {

    }
}

public class FindFirstOccPractice {










    public boolean isPalindrome(String s) {


        s = s.toLowerCase().replaceAll("[^a-z0-9]","");

        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }


        return true;
    }




    public int strStr(String haystack,String needle){

        for(int i=0,j=needle.length();j<=haystack.length();++i,++j){
            if(haystack.substring(i,j).equals(needle)) return i;
        }
Stack<String> st = new Stack<>();




        return -1;


    }


}

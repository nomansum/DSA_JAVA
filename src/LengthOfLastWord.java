public class LengthOfLastWord {



    // https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150
    public int lengthOfLastWord(String s) {

        int n = s.length();
        int i = n-1;
        int result = 0;

        while(i>=0){
            if(s.charAt(i)==' ')i--;
            else break;
        }

        while(i>=0){
            if(s.charAt(i)==' '){
                break;
            }
            --i;
            result++;
        }
        return result;

    }









}

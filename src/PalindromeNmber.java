public class PalindromeNmber {




    // https://leetcode.com/problems/palindrome-number/description/?envType=study-plan-v2&envId=top-interview-150
    public boolean isPalindrome(int x) {

        if(x<0 || ( x%10==0 && x!=0))return false;
        int reversedNumeber = 0;

        while(x>reversedNumeber){
            reversedNumeber = reversedNumeber*10 + (x%10);
            x/=10;
        }
        return x==reversedNumeber || (x==reversedNumeber/10);



    }








}

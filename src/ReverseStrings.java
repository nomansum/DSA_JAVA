public class ReverseStrings {



    public void reverseString(char[] s) {

    int left = 0;
    int right = s.length;

    while(left<right){

        char ch = s[left];
        s[left] = s[right];
        s[right] = ch;
        left++;
        right--;


    }



    }




}

import java.util.Scanner;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int length = s.length();

        int idxStart = 0;
        int idxEnd = length -1;
        StringBuilder str = new StringBuilder();
        str.append(s.toLowerCase());

        while(idxStart<idxEnd){
                   char a = str.charAt(idxStart);
                   char b = str.charAt(idxEnd);
            if( (a>47 && a<58)||(a>64 && a<91) || (a>96 && a<123) ){
                if( (b>47 && b<58)||(b>64 && b<91) || (b>96 && b<123) ){

                  if(str.charAt(idxStart)!=str.charAt(idxEnd)){
                      return false;
                  }
                  idxStart++;
                  idxEnd--;
                }
                else {
                    idxEnd--;
                }
            }
            else {
                idxStart++;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("race a car"));

    }
}

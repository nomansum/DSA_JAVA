public class LargestOddNumberInAString {
    // https://leetcode.com/problems/largest-odd-number-in-string/description/
    public static String largestOddNumber(String num) {

       // StringBuilder s = new StringBuilder(num);
      //  StringBuilder ans = new StringBuilder("");
        for(int i = num.length()-1;i>=0;--i){
             if(((num.charAt(i)-'0')&1)==1){
                 return num.substring(0,i+1);
             }

        }

        return "";

    }


    public static void main(String[] args) {
        System.out.println(largestOddNumber("2030"));
    }
}

public class NumberOfSubstringContainingAllThreeChars {
    // https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

    public static int numberOfSubstrings(String s) {

        int lastA  = -1;
        int lastB = -1;
        int lastC = -1;
        int total = 0;

        for(int i=0;i<s.length();++i){
            lastA = s.charAt(i)=='a'?i:lastA;
            lastB = s.charAt(i)=='b'?i:lastB;
            lastC = s.charAt(i)=='c'?i:lastC;

            //System.out.println(Math.min(lastA,Math.min(lastB,lastC)));

                total =total+ 1+Math.min(lastA,Math.min(lastB,lastC));




        }

return total;

    }


    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }
}

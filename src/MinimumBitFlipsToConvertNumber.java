public class MinimumBitFlipsToConvertNumber {

    // https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/
    public static int minBitFlips(int start, int goal) {

        int mismatch = start ^ goal;

        int result = 0;

        for(int i=0;i<32;++i){
            result += (mismatch & (1<<i))!=0?1:0;
        }

        return result;

    }


    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }




}

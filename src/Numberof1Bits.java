public class Numberof1Bits {



    // https://leetcode.com/problems/number-of-1-bits/description/?envType=study-plan-v2&envId=top-interview-150
    public  static int hammingWeight(int n) {

        int count = 0;
        for(int i=0;i<32;++i){
            count+= ((n>>>i) & 1);
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }


}

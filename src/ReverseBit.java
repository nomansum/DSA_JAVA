public class ReverseBit {




    // https://leetcode.com/problems/reverse-bits/description/?envType=study-plan-v2&envId=top-interview-150
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        int result = 0;

        for(int i=0;i<32;++i){

            int bit = n&1;
            result = (result<<1) | bit;

            n = n >>> 1;


        }

        return result;

    }










}

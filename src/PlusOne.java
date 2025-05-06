public class PlusOne {




    // https://leetcode.com/problems/plus-one/description/?envType=study-plan-v2&envId=top-interview-150
    public int[] plusOne(int[] digits) {

        for(int i= digits.length-1;i>=0;--i){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;


    }





}

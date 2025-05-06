public class HappyNumber {




    // https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150
    public boolean isHappy(int n) {

        int harePointer = getNextNumber(getNextNumber(n));
        int tortoisePointer  = getNextNumber(n);

        while(harePointer!=tortoisePointer){
            if(harePointer==1) return true;
            harePointer = getNextNumber(getNextNumber(harePointer));
            tortoisePointer = getNextNumber(tortoisePointer);
        }

        return tortoisePointer==1;

    }

    public int getNextNumber(int n){

        int result = 0;
        while(n>0){
            int digit = n%10;
            result += digit * digit;
            n/=10;
        }

        return result;
    }


}

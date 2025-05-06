public class LemonadeChange {

    // https://leetcode.com/problems/lemonade-change/description/
    public static  boolean lemonadeChange(int[] bills) {

        int income = 0;
        int toGive = 0;
        int fiveBill = 0;
        int tenBill = 0;
      //  int twentyBill =0;

        for(int val:bills){

            if(val == 5){
                fiveBill ++;
            }
            else if(val == 10){
                if(fiveBill>0){
                    fiveBill--;
                    tenBill++;
                }
                else {
                    return false;
                }
            }
            else {
                if(tenBill>0 && fiveBill>0){
                    tenBill--;
                    fiveBill--;

                }
                else if(fiveBill>2){
                    fiveBill-=3;
                }
                else {
                    return false;
                }
            }

        }

        return true;

    }


    public static void main(String[] args) {
        int[] arr = {5,5,5,10,20};
        System.out.println(lemonadeChange(arr));
    }

}

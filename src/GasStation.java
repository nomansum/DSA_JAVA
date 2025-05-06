import java.util.Arrays;

public class GasStation {


    // https://leetcode.com/problems/gas-station/description/?envType=study-plan-v2&envId=top-interview-150
    public int canCompleteCircuit(int[] gas, int[] cost) {

     int gasTotal = 0;
     int costTotal = 0;
     int index = 0;
     int total = 0;
     for(int i=0;i<gas.length;++i){
         gasTotal+=gas[i];
         costTotal+=cost[i];
     }

     if(gasTotal<costTotal) return -1;

     for(int i=0;i<gas.length;++i){

         total += gas[i]-cost[i];

         if(total<0){
             total = 0;
             index=i+1;
         }
     }
return index;
    }


    public static void main(String[] args) {
        int a = 12337;
        byte b = (byte)a;
 //b+=25;
        System.out.println(b);
    }


}

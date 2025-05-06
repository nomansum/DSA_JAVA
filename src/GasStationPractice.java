public class GasStationPractice {





    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;
        int total  = 0;
        int index = -1;

        for(int i=0;i<gas.length;++i){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas<totalCost) return index;

        for(int i=0;i<gas.length;++i){

            total += (gas[i]-cost[i]);
            if(total<0){
                index = i+1;
                total = 0;
            }

        }


       return index;
    }








}

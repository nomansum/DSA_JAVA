public class HIndex {

    // https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150
    public int hIndex(int[] citations) {


        int[] arr = new int[citations.length+1];

        int n = citations.length;

        for(int value:citations){
            if(value>=n)arr[n]++;
            else arr[value]++;
        }

        int total =0;

        for(int i=n;i>=0;--i)
        {
            total += arr[i];
            if(total>=i){
                return i;
            }
        }


        return 0;

    }



}

import java.sql.Array;
import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        List<int []> result = new ArrayList<>();

         Arrays.sort(intervals,(a,b)->a[0]-b[0]);

         result.add(intervals[0]);

         for(int i=1;i<intervals.length;++i){
             int[] temp = new int[2];
             if(result.getLast()[1] >= intervals[i][0]){
                 temp[0] = Math.min(result.getLast()[0],intervals[i][0]);
                 temp[1] = Math.max(result.getLast()[1],intervals[i][1]);
                 result.set(result.size()-1,temp);
             }else{
                 result.add(intervals[i]);
             }
         }

         return result.toArray(new int[result.size()][]);


    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{15,18},{8,10}};

       int[][] result = merge(arr);

        for(int[] values:result){
            for(int val:values){
                System.out.print(val + " " );
            }
            System.out.println();
        }

    }
}

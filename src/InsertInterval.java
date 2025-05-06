import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

      // https://leetcode.com/problems/insert-interval/description/

    public static int[][] insert(int[][] intervals, int[] newInterval) {


        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        int i =0;

        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
            ++i;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            ++i;
        }
        ans.add(new int[]{newInterval[0],newInterval[1]});

        while(i<n){
            ans.add(new int[]{intervals[i][0],intervals[i][1]});
                ++i;
        }
        int[][] res = new int[ans.size()][2];
        for(int j=0;j<ans.size();++j){
            res[j][0] = ans.get(j)[0];
            res[j][1] = ans.get(j)[1];
        }
return res;

    }


    public static void main(String[] args) {

    }

}

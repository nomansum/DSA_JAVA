import java.util.Arrays;

public class NonOverlappingIntervals {

    // https://leetcode.com/problems/non-overlapping-intervals/description/
    public static int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);

        int total  = 1;
        int lastEndTime = intervals[0][1];

        for(int i=1;i<intervals.length;++i){
            if(intervals[i][0]>=lastEndTime){
                lastEndTime = intervals[i][1];
                total++;
            }
        }

        return intervals.length-total;
    }


    public static void main(String[] args) {

    }
}

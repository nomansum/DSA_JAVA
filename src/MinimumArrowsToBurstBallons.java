import java.util.Arrays;
import java.util.Collections;

public class MinimumArrowsToBurstBallons {


    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int totalArrows = points.length;

        int[] prev = points[0];

        for (int i = 1; i < points.length; ++i) {

            int[] curr = points[i];

            if (curr[0] <= prev[1]) {
                totalArrows--;
                prev[0] = curr[0];
                prev[1] = Math.min(curr[1], prev[1]);
            } else {
                prev = curr;
            }


        }

        return totalArrows;

    }



}

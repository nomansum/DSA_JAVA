import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {

    // https://leetcode.com/problems/path-with-minimum-effort/description/
    public static int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);

       // int dist[][] = new int[n][m];

        for(int[] val:dist){
            Arrays.fill(val,Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        pq.add(new int[]{0,0,0});

        int dx[] = {0,0,1,-1};
        int dy[] ={-1,1,0,0};
        while(!pq.isEmpty()){

            int[] a = pq.poll();
            int x = a[1];
            int y = a[2];

            for(int i=0;i<4;++i){
                int newx = x + dx[i];
                int newy = y + dy[i];

                if(newx<n && newx>=0 && newy>=0 && newy<m){
                    int newDist = Math.max(a[0],Math.abs(heights[x][y]-heights[newx][newy]));

                    if(newDist<dist[newx][newy]){
                        dist[newx][newy] = newDist;
                        pq.add(new int[]{
                                newDist,newx,newy
                        });
                    }
                }

            }


        }

          return dist[n-1][m-1];
    }





}

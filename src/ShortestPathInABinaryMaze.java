import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInABinaryMaze {






    // https://leetcode.com/problems/shortest-path-in-binary-matrix/

    public int shortestPathBinaryMatrix(int[][] grid) {

        if(grid.length==1 && grid[0].length==1){
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;

        int[][] dist = new int[n][m];

        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j)dist[i][j]=(int)(1e9);
        }

        dist[0][0] = 0;
        class Tuple{
            int first,second,third;
            Tuple(int a,int b,int c){
                first = a;
                second = b;
                third = c;
            }
        }

        Queue<Tuple> queue = new LinkedList<>();

        queue.offer(new Tuple(0,0,0));
        int drx[]={-1,-1,-1,0,0,1,1,1};
        int dry[]={-1,0,1,-1,1,-1,0,1};
        while(!queue.isEmpty()){

            Tuple it = queue.poll();
            int r = it.second;
            int dis = it.first;
            int c = it.third;

            for(int i=0;i<8;++i){

                int newr = r+drx[i];
                int newc = c + drx[i];
                if(newr>=0 && newc>=0 && newr<n && newc<m && grid[newr][newc]==0 && (dis+1)<dist[newr][newc] ){
                    dist[newr][newc] = 1 + dis;
                    if(newr == n-1 && newc== m-1 ) return dis+1;
                    queue.offer(new Tuple(dis+1,newr,newc));
                }

            }



        }

        if(dist[n-1][m-1]!=(int)(1e9)) return dist[n-1][m-1];
        return -1;

    }





}













class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }

        Queue<CellTuple> queue = new LinkedList<>();
        queue.add(new CellTuple(1, 0, 0));
        grid[0][0] = 1;


        while (!queue.isEmpty()) {
            CellTuple current = queue.poll();
            int distance = current.distance;
            int row = current.row;
            int col = current.col;

            if (row == n - 1 && col == n - 1) {
                return distance;
            }

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newRow = row + i;
                    int newCol = col + j;

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
                        queue.add(new CellTuple(distance + 1, newRow, newCol));
                        grid[newRow][newCol] = 1;
                    }
                }
            }
        }

        return -1;
    }

    class CellTuple {
        int distance;
        int row;
        int col;

        CellTuple(int distance, int row, int col) {
            this.distance = distance;
            this.row = row;
            this.col = col;
        }
    }
}
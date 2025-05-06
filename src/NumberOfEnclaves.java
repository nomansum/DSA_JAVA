import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves {




    // https://leetcode.com/problems/number-of-enclaves/description/
    public static int numEnclaves(int[][] grid) {

        class Pair{
            int x;
            int y;
            Pair(int x, int y){
                this.x = x;
                this.y = y;
            }
        }

        Queue<Pair> queue = new LinkedList<>();

        int n = grid.length;
        int m = grid[0].length;
        boolean isVisited[][]  = new boolean[n][m];

        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1){
                        queue.offer(new Pair(i,j));
                       isVisited[i][j] = true;
                    }
                }
            }
        }

        int[] dir_x = {-1,0,1,0};
        int[] dir_y = {0,1,0,-1};

        while (!queue.isEmpty()){

            int row = queue.peek().x;
            int col = queue.peek().y;
            queue.poll();
          //  isVisited[row][col] = true;


            for(int i=0;i<4;++i){
                int newRow = row + dir_x[i];
                int newCol = col + dir_y[i];

                if(newRow<0|| newRow>=n || newCol<0 || newCol>=m || isVisited[newRow][newCol]==true

                || grid[newRow][newCol]==0
                ){
                    continue;
                }
                queue.offer(new Pair(newRow,newCol));
                isVisited[newRow][newCol] = true;
            }

        }
        int result = 0;

        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(isVisited[i][j]==false && grid[i][j]==1)result++;
            }
        }


        return result;
    }


    public static void main(String[] args) {

    }
}

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {


    class Coordinate{
        int x ;
        int y;
        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public   int numIslands(char[][] grid) {


        int[] dirx = {0,0,-1,1};
        int[] diry = {-1,1,0,0};
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[grid.length][grid[0].length];
        int total = 0;

        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){

                if(visited[i][j]==0&&grid[i][j]=='1')
                {
                    total++;
                    dfs(grid,visited,i,j,n,m,dirx,diry);
                }


            }
        }



return total;


    }

    public boolean dfs(char[][] grid, int[][] visited,int x, int y,int n , int m , int[] dirx, int[] diry){

        if(visited[x][y]==1) return false;

        visited[x][y] = 1;

        for(int i=0;i<4;++i){
            int xx = x+dirx[i];
            int yy = y + diry[i];

            if(xx<0 || yy<0 || xx>=n || yy>=m || grid[xx][yy]=='0' || visited[xx][yy]==1 ){
                continue;
            }
            dfs(grid,visited,xx,yy,n,m,dirx,diry);

        }

        return true;
    }




}

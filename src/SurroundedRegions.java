public class SurroundedRegions {


    // https://leetcode.com/problems/surrounded-regions/description/
    public static void solve(char[][] board) {

       int n = board.length;
       int m =  board[0].length;
       int[] delRow = {-1,0,1,0};
       int[] delCol = {0,1,0,-1};

       int[][] isVisited = new int[n][m];

       for(int j=0;j<m;++j){

           if(isVisited[0][j]==0 && board[0][j]=='O'){
              dfs(0,j,isVisited,board,delRow,delCol);
           }
           if(isVisited[n-1][j]==0 && board[n-1][j]=='O'){
               dfs(n-1,j,isVisited,board,delRow,delCol);
           }

       }
        for(int i=0;i<n;++i){

            if(isVisited[i][0]==0 && board[i][0]=='O'){
                dfs(i,0,isVisited,board,delRow,delCol);
            }
            if(isVisited[i][m-1]==0 && board[i][m-1]=='O'){
                dfs(i,m-1,isVisited,board,delRow,delCol);
            }
        }

        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                if(isVisited[i][j]==0 && board[i][j]=='O') board[i][j]='X';
            }
        }

return;

    }

  public static  void dfs(int row,int col , int[][] isVisited, char[][] board,int[] delRow,int[] delCol){

         isVisited[row][col] = 1;
         int n = board.length;
         int m = board[0].length;

         for(int i=0;i<4;++i){
             int newRow = row + delRow[i];
             int newCol = col + delCol[i];

             if(isValid(newRow,newCol,n,m) && isVisited[newRow][newCol]==0 && board[newRow][newCol]=='O'){
                 dfs(newRow,newCol,isVisited,board,delRow,delCol);
             }

         }


    }

    public static boolean isValid(int i, int j, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m){
            return false;
        }
        return true;
    }


}

public class GameOfLife {


    public void gameOfLife(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        for(int i=0;i<rows;++i){

            for(int j=0;j<cols;++j){

                int neighbours = countNeighbour(board,i,j,rows,cols);

                if(board[i][j]!=0){
                    if(neighbours==2 || neighbours==3){
                        board[i][j] = 3;
                    }

                }
                else {
                    if(neighbours==3){
                        board[i][j] = 2;
                    }
                }


            }


        }
        for(int i=0;i<rows;++i){
            for(int j =0;j<cols;++j){
                if(board[i][j]==2 || board[i][j]==3)
                    board[i][j] = 1;
                else board[i][j] = 0;
            }
        }




    }


    public static int countNeighbour(int[][] board, int r,int c,int rows,int cols){


    int neighbours = 0;

    for(int i=r-1;i<r+2;++i){
        for(int j=c-1;j<c+2;++j){

            if(i==rows || j==cols || i<0 || j<0 || (i==r && j==c))continue;

            if(board[i][j]==1 || board[i][j]==3)neighbours++;

        }
    }
return neighbours;

    }






}

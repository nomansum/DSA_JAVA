import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class SnakesAndLadders {



    public int snakesAndLadders(int[][] board) {
      int n = board.length;

        int l = 0, r = board.length-1;
        while(l < r) {
            int[] temp = board[l];
            board[l] = board[r];
            board[r] = temp;
            l++;
            r--;
        }

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{1,0});
        boolean[] visited = new boolean[n*n+1];
        visited[1]=true;

        while(!queue.isEmpty()){

            int[] curr = queue.poll();

            for(int i=1;i<7;++i){

                int nextSquare = curr[0]+i;
                int[] coordinate = positions(nextSquare,n);

                if(board[coordinate[0]][coordinate[1]]!=-1){
                    nextSquare=board[coordinate[0]][coordinate[1]];
                }
                if(nextSquare==n*n)
                    return curr[1]+1;
                if(!visited[nextSquare]){
                    visited[nextSquare]=true;
                    queue.offer(new int[]{nextSquare,curr[1]+1});
                }


            }




        }



return -1;

    }

    public static int[] positions(int square,int length){

        int r = (square-1)/ length;
        int c = (square-1)%length;
        if((r%2)!=0)
            c = length-1-c;
        return new int[] {r,c};

    }

    public static void main(String[] args) {

    }


}

import java.util.HashSet;

public class NQUEENS2 {




int count =0;


    public int totalNQueens(int n) {


HashSet<Integer> pos = new HashSet<>();
   HashSet<Integer> neg = new HashSet<>();
   HashSet<Integer> col = new HashSet<>();
backtrack(pos,neg,col,0,n);
return count;

    }

public void backtrack(HashSet<Integer> pos,  HashSet<Integer> neg,
                      HashSet<Integer> col , int row , int n
                      ){
        if(row==n){
            count++;
        return;}

        for(int c=0;c<n;++c){

            if(col.contains(c)||pos.contains(row+c)||neg.contains(row-c))continue;

            col.add(c);
            pos.add(row+c);
            neg.add(row-c);
            backtrack(pos,neg,col,row+1,n);
            col.remove(c);
            pos.remove(row+c);
            neg.remove(row-c);



        }



}




}

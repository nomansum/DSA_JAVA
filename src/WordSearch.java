public class WordSearch {
    // https://leetcode.com/problems/word-search/description/
    public static boolean exist(char[][] board, String word) {

        StringBuilder builtString = new StringBuilder();
        boolean[][] mark = new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;++i){
            for(int j=0;j<board[0].length;++j){
                if(board[i][j]==word.charAt(0)){
                    if(buildWord(0,board,word,builtString,i,j,board.length,board[0].length,mark))
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean buildWord(int index,char[][] board,String word, StringBuilder builtString,int i , int j,int n , int m , boolean[][] mark){

        if(index == word.length()){
             return true;
        }

        if(i<0 || i>=n || j<0 || j>=m || mark[i][j]==true || board[i][j]!=word.charAt(index)){
            return false;
        }
        mark[i][j] = true;
       if(buildWord(index+1,board,word,builtString,i+1,j,n,m,mark)||
               buildWord(index+1,board,word,builtString,i-1,j,n,m,mark)||
               buildWord(index+1,board,word,builtString,i,j-1,n,m,mark)||
               buildWord(index+1,board,word,builtString,i,j+1,n,m,mark)
       ){
           return true;
       }
        mark[i][j] = false;


return false;
    }


    public static void main(String[] args) {

    }



}

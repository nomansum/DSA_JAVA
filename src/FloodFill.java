public class FloodFill {





    // https://leetcode.com/problems/flood-fill/solutions/4538337/simply-dfs-with-0ms-with-100-beats/
    public  int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int initialColor = image[sr][sc];
        int[][] ans = image;
        int delRow[] = {-1,0,+1,0};
        int delCol[] = {0,+1,0,-1};
        dfs(sr,sc,ans,image,color,delRow,delCol,initialColor);
    return ans;
    }

    public void dfs(int row,int col,int[][] ans,int[][] image,
                    int newColor,int delRow[],int[] delCol,
                    int initialColor
                    ){
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        for(int i=0;i<4;++i){
            int newRow = row+delRow[i];
            int newCol = col + delCol[i];
            if(newRow>=0 && newRow<n && newCol>=0 && newCol<m
            && image[newRow][newCol]==initialColor &&
                    ans[newRow][newCol] != newColor
            ){
                dfs(newRow,newCol,ans,image,newColor,delRow,delCol,initialColor);
            }
        }

    }


    public static void main(String[] args) {

    }



}

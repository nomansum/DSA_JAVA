public class MatrixProblems {





    public void search(int[][] matrix,int n , int x){
        int i = 0;
        int j = n-1;
        while( i<n && j>=0 ){

            if(matrix[i][j]==x){
                System.out.println("X found at - "+i + " , "+j);
                return;
            }
            if(matrix[i][j]>x){
                j--;
            }
            else {
                i++;
            }

        }
        System.out.println("Not In The Matrix");
    }

 public void printGivenMatInSpiralForm(int[][] matrix,int row,int col ){

        int i,k = 0,l = 0;

        while(k<row && l<col){

            for (i = l;i<col;++i){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            for (i = k;i<row;++i){
                System.out.print(matrix[i][col-1] + " ");
            }
            col--;

            if(k<row){
                for (i = col-1;i>=l;--i){
                    System.out.print(matrix[row-1][i] + " ");
                }
                row--;
            }


            if(l<col){
                for (i = row-1;i>=k;--i){
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }




        }






 }





    public static void main(String[] args){
     int[][] matrix = {
             {1,2,3,4},
             {5,6,7,8},
             {9,10,11,12},
             {13,14,15,16}
     };
     MatrixProblems cl = new MatrixProblems();
    cl.printGivenMatInSpiralForm(matrix,4,4);
    }
}

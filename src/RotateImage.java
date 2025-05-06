public class RotateImage {
//https://leetcode.com/problems/rotate-image/description/

    public static  void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length-1;++i){

            for(int j=i+1;j<matrix.length;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

        for(int[] row:matrix){

            int start = 0 ;
            int end = matrix.length-1;
            while(start<end){
                int temp = row[start];
                row[start] = row[end];
                row[end] = temp;
                start++;
                end--;
            }

        }


    }


    public static void main(String[] args) {

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};


        rotate(matrix);
        for(int[] a: matrix){
            MergeSort.printArray(a);
            System.out.println();
        }



    }
}

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {


    public static  List<Integer> spiralOrder(int[][] matrix) {
             List<Integer> spiralOrderNumbers = new ArrayList<>();

             int top,bottom , left , right;
             top = 0;
             left = 0;
             right = matrix[0].length-1;
             bottom = matrix.length - 1;

             while(top<=bottom && left<=right){

               for(int i = left;i<= right;++i){
                   spiralOrderNumbers.add(matrix[top][i]);
               }
               top++;
               for(int i=top;i<=bottom;++i){
                   spiralOrderNumbers.add(matrix[i][right]);
               }
               right--;
            if(top<=bottom){
                for(int i=right;i>=left;--i){
                    spiralOrderNumbers.add(matrix[bottom][i]);
                }
                bottom--;
            }
               if(left<=right){
                   for(int i = bottom;i>=top;--i){
                       spiralOrderNumbers.add(matrix[i][left]);
                   }
                   left++;
               }

             }
             return spiralOrderNumbers;
    }


    public static void main(String[] args) {
      int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

      List<Integer> ans = spiralOrder(matrix);
      for(Integer val:ans){
          System.out.print(val + " ");
      }
        System.out.println();
    }

}

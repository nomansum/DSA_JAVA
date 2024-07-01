import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
// https://leetcode.com/problems/pascals-triangle/description/

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        for(int i=0;i<numRows;++i){
      List<Integer> row = getRowOfPascalTriangle(i);
     pascalsTriangle.add(row);
        }
    return pascalsTriangle;
    }

    public static List<Integer> getRowOfPascalTriangle(int row){
        List<Integer> generatedRow = new ArrayList<>();
        Integer currentValue = 1;
        generatedRow.add(1);
        for(int col = 0;col<row;++col){
            currentValue *= (row - col );
            currentValue /= (col+1);
            generatedRow.add(currentValue);
        }

return generatedRow;

    }




    public static void main(String[] args) {

        int[][] arr = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
         List<List<Integer>> ans = generate(6);
         for(List<Integer> values:ans){
             for(Integer val:values){
                 System.out.print(val + " ");
             }
             System.out.println();
         }

    }
}

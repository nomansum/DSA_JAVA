public class FindAPeakElement2 {

    // https://leetcode.com/problems/find-a-peak-element-ii/description/
    public static int[] findPeakGrid(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        int left = 0;
        int right = m-1;

        while(left<=right){
            int mid = (left+right)/2;
            int maxRowIndex = findMaxValueIndex(mat,mid);
            int leftElement = (mid-1) >=left ? mat[maxRowIndex][mid-1]:-1;
            int rightElement = (mid+1) <= right ? mat[maxRowIndex][mid+1]:-1;

            if(mat[maxRowIndex][mid]>leftElement && mat[maxRowIndex][mid]>rightElement){
                return new int[] {maxRowIndex,mid};
            }
            else if(mat[maxRowIndex][mid]<leftElement){
                right = mid -1;
            }
            else {
                left = mid + 1;
            }



        }
return new int[] {-1,-1};

    }

    public static int findMaxValueIndex(int[][] nums , int col){
        int maxVal = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0;i<nums.length;++i){
            if(nums[i][col]>maxVal){
                maxVal = nums[i][col];
                index = i;
            }
        }


        return index;
    }


    public static void main(String[] args) {

    }
}

public class Sorting {




    public static int[] sortedSquares(int[] arr){

        int[] result = new int[arr.length];
        int n = arr.length;
        int i = 0;
        int j = n-1;
        for(int k = n-1;k>=0;--k){

            if(Math.abs(arr[i])>Math.abs(arr[j])){
                result[k] = arr[i] * arr[i];
                i++;
            }
            else{
                result[k] = arr[j] * arr[j];
                j--;
            }

        }
        return result;
    }





    public static void main(String[] args) {
        int[] arr = {-5,-4,0,2,2,3,10,15,16,90};
int[] result = sortedSquares(arr);
      MergeSort.printArray(result);
        System.out.println("here");
    }
}

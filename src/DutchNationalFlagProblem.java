public class DutchNationalFlagProblem {




    public static void solution(int[] arr){
        int i = 0;
        int j = 0;
        int k = arr.length -1;

        while(i<=k){
       if(arr[i]==0){
           swap(arr,i,j);
           i++;j++;
       }
       else if(arr[i]==1){
           ++i;
       }
       else if(arr[i]==2){
           swap(arr,i,k);
           k--;
       }

        }
    }

public static void swap(int[] arr, int pos1  , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
}





    public static void main(String[] args){
              int[] arr = {2,2,2,1,0,1,2,0,0,1,1,0,0,0,0,2,0,1};
              solution(arr);
              MergeSort.printArray(arr);
    }
}

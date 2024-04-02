public class QuickSort {



public static int partition(int[] arr , int low , int high){

    int pivot = arr[high];
    int i = low;
    int j = low;
    while(i<=high){
        if(arr[i]<=pivot){
              swap(arr,i,j);
              ++j;
        }
        ++i;
    }
    return j-1;

}

public  static void quickSort(int[] arr,int low,int high){
    if(low<high){
        int p = partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
}

    public static void swap(int[] arr, int pos1  , int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }




    public static void main(String[] args){
        int[] arr = {10,15,11,9,100,87,4,2,1};
     quickSort(arr,0,arr.length-1);
     MergeSort.printArray(arr);
    }
}

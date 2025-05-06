public class QuickSortPractice {



    public int partition(int[] arr, int low, int high){

    int pivot = arr[low];

    int i = low;
    int j = high;

    while(i<j){

        while(arr[i]<=pivot && i<high){
            i++;
        }
        while(arr[j]>pivot && j>low){
            j--;
        }

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;

    }
  public void quickSort(int[] arr,int low, int high){

        if(low<high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }


  }





}

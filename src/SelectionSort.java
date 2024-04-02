public class SelectionSort {




public static  void selectionSort(int[] arr){
    int n = arr.length;
    for(int i=0;i<n-1;++i){

        int min = i;
        for(int j = i +1 ;j< n; ++j){

            if(arr[j]<arr[min]){
                min  = j;
            }

        }
        int temp  = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }


}






    public static void main(String[] args){
    int[] arr = {100,2,200,20,10,90,10,9,8,7,6,5,4,3,2,1};
        selectionSort(arr);
    BubbleSort.printArray(arr);

    }
}

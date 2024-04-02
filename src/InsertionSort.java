public class InsertionSort {






    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1;i<n;++i){
            int temp = arr[i];
            int j = i -1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }


    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i] + " " );
        }
    }




    public static void main(String[] args){
            int[] arr = {10,19,1,2,55,23,4,10,9,8,7,6,5,4,3,2,1};
            insertionSort(arr);
            printArray(arr);
        System.out.println();
    }
}

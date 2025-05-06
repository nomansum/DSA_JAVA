public class SelectionSortPractice {










public void selectionSort(int[] arr, int n){

    int minIndex = 0;
    for(int i=0;i<n-1;++i){
        minIndex = i;
        for(int j=i+1;j<n;++j){
            if(arr[j]<arr[minIndex])minIndex=j;
        }
        int temp = arr[i];
        arr[i]  = arr[minIndex];
        arr[minIndex]  =  temp;
    }

}

    public static void main(String[] args){

        System.out.println("lksjd");

    }



}

public class MergeSortPractice {


    public void merge(int[] arr, int low , int mid,int high){
        int[] temp  = new int[high-low+1];
        int index = 0;
        int left  = low;
        int right = mid+1;
        while (left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[index++] = arr[left];
                left++;
            }
            else {
                temp[index++] = arr[right];
                right++;
            }
        }
        while (left<=mid){
            temp[index++] = arr[left];
            left++;
        }
        while(right<=high){
            temp[index++] = arr[right];
            right++;
        }
        for(int i=low;i<=high;++i){
            arr[i] = temp[i-low];
        }

    }


public void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid= (low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);

}





}

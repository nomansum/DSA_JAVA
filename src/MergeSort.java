public class MergeSort {




public static void mergeSort(int[] arr,int[] temp , int low , int high){

  if(low<high){
      int mid = (low+high)/2;
      mergeSort(arr,temp,low,mid);
      mergeSort(arr,temp,mid+1,high);
      merge(arr,temp,low,mid,high);
  }

}
public static void merge(int[] arr,int[] temp , int low ,int mid , int high){

    for(int i=low;i<=high;++i){
        temp[i] = arr[i];
    }
  int i = low; int j = mid+1; int k = low;

  while(i<=mid && j<=high){
      if(temp[i]<=temp[j]){
          arr[k] = temp[i];
          ++i;
      }
      else{
          arr[k] = temp[j];
         ++j;
      }
      k++;
  }
  while(i<=mid){
      arr[k] = temp[i];
      i++;
      k++;
  }
    while(j<=high){
        arr[k] = temp[j];
        j++;
        k++;
    }

}



public static void printArray(int[] arr){
    for(int i=0;i<arr.length;++i){
        System.out.print(arr[i]+"  ");
    }
    System.out.println();
}






    public static void main(String[] args){
        int[] arr = {10,15,11,9,100,87,4,2,1};
        int[] temp = new int[arr.length];
        mergeSort(arr,temp,0,arr.length-1);
        printArray(arr);
    }


}

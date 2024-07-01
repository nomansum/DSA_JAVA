public class ReversePair {

// https://leetcode.com/problems/reverse-pairs/description/






    public static int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
      return mergeSort(nums,temp,0,nums.length-1);
    }

    public static int mergeSort(int[] arr,int[] temp , int low , int high){
         int pairCount = 0;
        if(low<high){
            int mid = (low+high)/2;
          pairCount+= mergeSort(arr,temp,low,mid);
           pairCount+= mergeSort(arr,temp,mid+1,high);
          pairCount += countPairs(arr,low,mid,high);
            merge(arr,temp,low,mid,high);
        }
  return pairCount;
    }
    public static int countPairs(int[] arr,int low,int mid,int high){
       int right = mid+1;
       int pairCount = 0;

       for(int i=low;i<=mid;++i){

           while(right<=high && arr[i]>(long)( (long)2 * arr[right] )){
               right++;
           }
           pairCount += (right-(mid+1));

       }
 return pairCount;

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


    public static void main(String[] args) {
       int[] arr = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(arr));
    }
}

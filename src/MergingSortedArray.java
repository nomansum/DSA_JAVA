public class MergingSortedArray {




    public static int[] mergeTwoSortedArray(int[] arr1,int[] arr2){

        int n = arr1.length;
        int m = arr2.length;
        int i = 0,j = 0;
        int p = 0;
        int[] arr = new int[n+m];
       while (i<n && j<m){
           if(arr1[i]<arr2[j]){
               arr[p]=arr1[i];
               i++;
           }
           else{
               arr[p]=arr2[j];
               j++;
           }

           p++;
       }

       while (i<n){
           arr[p]=arr1[i];
           i++;
           p++;
       }
     while (j<n){
         arr[p]=arr2[j];
         j++;
         p++;
     }

return arr;
    }









    public static void main(String[] args){

        int[] arr1 = {1,5,9,90,101};
        int[] arr2 = {2,4,10,45,50,91,92,93,94,95,96,97};
        int[] result  = mergeTwoSortedArray(arr1,arr2);
        BubbleSort.printArray(result);


    }
}

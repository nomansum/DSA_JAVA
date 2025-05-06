public class LowerBoundPractice {




    public static int lowerBound(int []arr, int n, int x) {

         int left = 0;
         int right = arr.length-1;
         int mid = -1;
         int ans = n;
         while(left<=right){

              mid = (left+right)/2;

             if(arr[mid]<x){
                 left = mid+1;
             }
             else{
                 ans  = mid;
                 right = mid-1;
             }


         }

return ans;
    }











}

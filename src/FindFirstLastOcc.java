public class FindFirstLastOcc {







    public static int count(int arr[], int n, int x) {
        if(findFirstOcc(arr, n, x)==-1) return 0;

        return findLastOcc(arr,n,x) - findFirstOcc(arr,n,x) + 1;

    }


    public static  int findFirstOcc(int[] arr,int n, int val){

        int left = 0;
        int right = arr.length-1;
        int idx = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==val){
                idx = mid;
                right = mid - 1;
            }
            else if(arr[mid]>val){
                right=mid-1;
            }
            else left = mid+1;
        }
        return idx;
    }

    public static int findLastOcc(int[] arr,int n, int val){

        int left = 0;
        int right = arr.length-1;
        int idx = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==val){
                idx = mid;
                left= mid + 1;
            }
            else if(arr[mid]>val){
                right=mid-1;
            }
            else left = mid+1;
        }
        return idx;
    }






}

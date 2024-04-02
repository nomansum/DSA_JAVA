public class Search {





public int search(int[] arr,int n,int x){
    for(int i=0;i<n;++i){
        if(arr[i]==x){
            return i;
        }
    }
    return -1;
}
public int binarySearch(int[] arr,int val){
    int low  = 0;
    int high = arr.length - 1;

    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==val){
            return mid;
        }
        if(val<arr[mid]){
            high = mid -1;
        }
        else{
            low = mid+1;
        }
    }

    return -1;
}

public static int binarySearchReturnPossibleIndexofUnknownValue(int[] arr,int key){

    int low  = 0;
    int high = arr.length -1;
    int mid = (low + high) / 2;
    while(low<=high){

        mid = (low+high)/2;
        if(arr[mid]==key){
            return mid;
        }
        if(arr[mid]<=key){
            low = mid + 1 ;
        }
        else{
            high = mid - 1 ;
        }

    }


    return low;
}




    public static void main(String[] args){
    int[] arr = {1,3,5,7};
    int[] nums = new int[10];
    int[][] mul = new int[5][10];

        System.out.println(binarySearchReturnPossibleIndexofUnknownValue(arr,0));

    }
}

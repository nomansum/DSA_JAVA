import java.util.ArrayList;
import java.util.Arrays;

public class PrintingLIS {



    static int longestSubsequence(int arr[]) {
        // code here
   int[] list = new int[arr.length];
//        lis.add(arr[0]);
        list[0] = arr[0];
        int len = 1;
        for(int i=1;i<arr.length;++i){

            if(arr[i]>list[len-1]){
                list[len] = arr[i];
                len++;
               // System.out.println("last index "+(len-1)+" with value "+list[len-1]);

            }
            else {
                int idx = lowerBound(list,0,len,arr[i]);
              //  System.out.println("idx "+idx+ " value "+arr[i]);
                list[idx] = arr[i];
            }


        }

return len;

    }

    public static int lowerBound(int[] arr,int low, int high,int key){

        int mid = (low+high)/2;
        int len = high+1;

        while(low<high){

            mid = (low+high)/2;
            if(key<=arr[mid])high  = mid;
            else low = mid+1;

        }

        if(low<len && arr[low]<key)low++;

        return low;

    }


    public static int longestIncreasingSubsequence(int arr[]) {



        int[] dp = new int[arr.length+1];
        int[] hash = new int[arr.length+1];
        for(int i=0;i<dp.length;++i){
            dp[i]= 1;
            hash[i] = i;
        }

        int result = 1;
         int lastIndex = 0;
        for(int i=0;i<arr.length;++i){

            for(int prev=0;prev<i;++prev){

                if(arr[prev]<arr[i] && (1+dp[prev])>dp[i]){
                    dp[i] = 1+dp[prev];
                    hash[i] = prev;
                }

            }
           if(dp[i]>result){
               result = dp[i];
               lastIndex = i;
           }
        }
while(true){
    System.out.println(arr[lastIndex]);
    if(hash[lastIndex]==lastIndex) break;
    lastIndex = hash[lastIndex];

}
return result;

    }


    public static int longestIncreasingSubsequence(int arr[],int n) {



        int[][] dp = new int[arr.length+1][arr.length+1];

        for(int idx=arr.length-1;idx>=0;idx--){

            for(int prevIdx= idx-1;prevIdx>=-1;prevIdx--){

                int notTake = 0 + dp[idx+1][prevIdx +1];

                int take = 0;

                if(prevIdx == -1 || arr[idx] > arr[prevIdx]){

                    take = 1 + dp[idx+1][idx+1];
                }

                dp[idx][prevIdx+1] = Math.max(notTake,take);

            }


        }
        return dp[0][0];

    }



    public static int solve(int idx,int prevIdx,int[][] dp  , int[] arr){

        if(idx==arr.length) return 0;

        if(dp[idx][prevIdx+1]!=-1) return dp[idx][prevIdx+1];
        int len = 0 + solve(idx+1,prevIdx,dp,arr);

        if(prevIdx==-1 || arr[idx]>arr[prevIdx]){
            len = Math.max(len,1+solve(idx+1,idx,dp,arr));
        }

        return dp[idx][prevIdx+1] = len;

    }

    public static void main(String[] args) {
        int[] arr={0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        int[] arr1 = {5,8,3,7,9,1};
        System.out.println(longestSubsequence(arr));
        System.out.println(longestSubsequence(arr1));
        //int[] arr1 = {1,2,4,5};
      //  System.out.println(lowerBound(arr1,0,3,2));
    }


}

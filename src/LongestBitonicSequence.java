public class LongestBitonicSequence {




    // https://www.naukri.com/code360/problems/longest-bitonic-sequence_1062688?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos
    public static int longestBitonicSequence(int[] arr, int n) {

        int[] dp2 = new int[n];
        int[] dp1 = new int[n];
        for(int i=0;i<n;++i){
            dp1[i] = dp2[i] = 1;
        }
        for(int i=0;i<n;++i){

            for(int j=0;j<i;++j){
                if(arr[j]<arr[i] && (1+dp1[j])>dp1[i]){
                    dp1[i] =  1 + dp1[j];
                }
            }


        }

        for(int i=n-1;i>-1;--i){

            for(int j=n-1;j>=i;--j){
                if(arr[j]<arr[i] && (1+dp2[j])>dp2[i]){
                    dp2[i] =  1 + dp2[j];
                }
            }


        }


int result = 0;
        for(int i=0;i<n;++i){
            result = Math.max(result,dp1[i]+dp2[i]-1);
        }
return result;

    }









}

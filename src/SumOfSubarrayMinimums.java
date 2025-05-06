import java.util.List;
import java.util.Stack;

public class SumOfSubarrayMinimums {
    // https://leetcode.com/problems/sum-of-subarray-minimums/description/
    public static int sumSubarrayMins(int[] arr) {

        long total = 0;
        int mod = 1000000007;
        int[] nse = generateNSE(arr);
        int[] psee = generatePSEE(arr);
        for(int i=0;i<arr.length;++i){
            int left = i-psee[i];
            int right = nse[i] - i;
            total = (total + (right * left *1L* arr[i])%mod)%mod;
        }

        return (int)total;


    }
  public static int[] generateNSE(int[] arr){
        int[] nse = new int[arr.length];
      Stack<Integer> stack = new Stack<>();

      for(int i = arr.length-1;i>=0;--i){

          while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
              stack.pop();
          }

          nse[i] = stack.isEmpty()?arr.length:stack.peek();

          stack.push(i);


      }

return nse;

  }
  public static int[] generatePSEE(int[] arr){

     int[] psee = new int[arr.length];
     Stack<Integer> stack = new Stack<>();
     for(int i=0;i<arr.length;++i){

         while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
             stack.pop();
         }
         psee[i] = stack.isEmpty()?-1:stack.peek();
         stack.push(i);


     }

return psee;

  }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}

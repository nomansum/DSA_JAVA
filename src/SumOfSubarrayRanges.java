import java.util.Stack;

public class SumOfSubarrayRanges {
    // https://leetcode.com/problems/sum-of-subarray-ranges/description/



    public static long subArrayRanges(int[] nums) {

        long minSum = sumSubarrayMins(nums,true);
        long maxSum = sumSubarrayMins(nums,false);

        return Math.abs(minSum-maxSum);

    }

    public static long sumSubarrayMins(int[] arr,boolean flag) {

        long total = 0;
       // int mod = 1000000007;
        int[] nse = generateNSE(arr,flag);
        int[] psee = generatePSEE(arr,flag);
        for(int i=0;i<arr.length;++i){
            int left = i-psee[i];
            int right = nse[i] - i;
            total = (total + (right * left *1L* arr[i]));
        }

        return total;


    }
    public static int[] generateNSE(int[] arr,boolean flag){
        int[] nse = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length-1;i>=0;--i){

          if(flag==true){
              while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                  stack.pop();
              }
          }

            else {
                while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                    stack.pop();
                }
            }



            nse[i] = stack.isEmpty()?arr.length:stack.peek();

            stack.push(i);


        }

        return nse;

    }
    public static int[] generatePSEE(int[] arr,boolean flag){

        int[] psee = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;++i){

             if(flag ==true){
                 while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                     stack.pop();
                 }
             }
             else {
                 while(!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                     stack.pop();
                 }
             }


            psee[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);


        }

        return psee;

    }

    public static void main(String[] args) {
   int[] arr ={1,3,3};
        System.out.println(subArrayRanges(arr));
    }
}

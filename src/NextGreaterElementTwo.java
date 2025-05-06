import java.util.Stack;
public class NextGreaterElementTwo {
    // https://leetcode.com/problems/next-greater-element-ii/description/


    public static int[] nextGreaterElements(int[] nums) {

       Stack<Integer> stack = new Stack();
       int[] arr = new int[nums.length];


       for(int i = nums.length-1;i>=(-nums.length);--i){
           int index = i<0?i+nums.length:i;

           while(!stack.isEmpty() && stack.peek()<=nums[index]){
               stack.pop();
           }

           if(stack.isEmpty()){
               arr[index] = -1;
           }
           else {
               arr[index] = stack.peek();
           }
           stack.push(nums[index]);


       }

       return arr;

    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3};

        int[] ans = nextGreaterElements(arr);

        for(int val:ans){
            System.out.println(val);
        }

    }
}

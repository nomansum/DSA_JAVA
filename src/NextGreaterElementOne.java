import java.util.Stack;
public class NextGreaterElementOne {
    // https://leetcode.com/problems/next-greater-element-i/description/


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack  = new Stack();
       int[] mappings  = new int[11000];

       for(int i= nums2.length-1;i>=0;--i){

           while(!stack.isEmpty() && stack.peek()<=nums2[i]){
               stack.pop();
           }

           if(stack.isEmpty()){
               mappings[nums2[i]] = -1;
           }
           else {
               mappings[nums2[i]] = stack.peek();
           }
           stack.push(nums2[i]);


       }
       int[] arr = new int[nums1.length];
        int index = 0;
       for(int val:nums1){
           arr[index++] = mappings[val];

       }
       return arr;



    }


    public static void main(String[] args) {

    }
}

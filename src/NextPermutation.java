import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    //  https://leetcode.com/problems/next-permutation/


    public static void nextPermutation(int[] nums) {


        int idx = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;--i){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
           reverseSubarray(nums,0,nums.length-1);
             return ;
        }

         for(int i = n-1;i>idx;--i){
             if(nums[i]>nums[idx]){
                 swap(nums,i,idx);
                 break;
             }
         }

      reverseSubarray(nums,idx+1,nums.length-1);

    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void reverseSubarray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static  void main(String[] args) {
         int[] arr = {3,2,1};
          nextPermutation(arr);

//          List<Integer> list = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
//          Collections.reverse(list);
//          arr = list.stream().mapToInt(Integer::intValue).toArray();
          MergeSort.printArray(arr);

    }

}

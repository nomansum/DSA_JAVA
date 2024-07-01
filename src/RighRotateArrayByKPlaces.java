import java.util.ArrayList;

public class RighRotateArrayByKPlaces {








    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverseArray(nums,nums.length-k,nums.length-1);
        reverseArray(nums,0,nums.length-k-1);
        reverseArray(nums,0,nums.length-1);



    }
    public static void reverseArray(int[] nums,int start,int end){
        int temp ;
        while(start<end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateInefficient(int[] nums, int k) {
     k = k % nums.length;

        ArrayList<Integer> arr  = new ArrayList<>();

        for(int i =0;i<(nums.length-k);++i){
            arr.add(nums[i]);
        }

        for(int i = 0;i<k;++i){
            nums[i] = nums[nums.length-k+i];
        }

        for(int i=0 ;i<nums.length-k;++i){
            nums[k+i] = arr.get(i);
        }



    }

    public static void main(String[] args) {

          int[] arr1 = {-1,-100,3,99};
          int[] arr= {-1,-100,3,99};


          rotate(arr1,2);
          for(int val : arr1){
              System.out.print(val+ " " );
          }
        System.out.println();

    }
}

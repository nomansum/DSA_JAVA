public class SortColors {

    //https://leetcode.com/problems/sort-colors/description/

    public static void sortColors(int[] nums) {

    int zeroPointer  = 0;
    int onePointer = 0;
    int twoPointer = nums.length - 1;
    while (onePointer<=twoPointer){

        System.out.println("Zero " + zeroPointer);
        System.out.println("One " + onePointer);
        System.out.println("TWo " + twoPointer);
        if(nums[onePointer]==0){
         swap(nums,zeroPointer,onePointer);
         zeroPointer++;
         onePointer++;
        }
        else if(nums[onePointer]==1){
            onePointer++;

        }
        else {
            swap(nums,onePointer,twoPointer);
            twoPointer--;
        }



    }


    }
    public static void swap(int[] nums, int i, int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }


    public static void main(String[] args) {
         int[] arr = {2,0,1};

    sortColors(arr);
    MergeSort.printArray(arr);

    }
}

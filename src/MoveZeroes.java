public class MoveZeroes {


    public void moveZeroes(int[] nums) {

       int n  = nums.length;

       int zeroIndex = -1;
       int nonZeroIndex = 0;

       int idx = 0;
       while(idx<n){

           if(nums[idx]==0 && zeroIndex==-1){
               zeroIndex=idx;
           }

       }
    }

    public static void main(String[] args) {
        int[] arr ={0,1,0,3,12};
        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(arr);
        for(int val:arr){
            System.out.println(val);
        }
    }
}

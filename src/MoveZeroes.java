public class MoveZeroes {


    public static void moveZeroes(int[] nums) {

       int n  = nums.length;
       int zeroIndex = -1;
       int idx = 0;
       while(idx<n){
          if(nums[idx]==0 && zeroIndex==-1){
              zeroIndex = idx;
          }
          if(nums[idx]!=0 && zeroIndex!=-1){
                  int temp = nums[idx];
                  nums[idx] = nums[zeroIndex];
                  nums[zeroIndex] = temp;
                  if(idx - zeroIndex>1){
                      zeroIndex++;
                  }
                  else {
                      zeroIndex = idx;
                  }
          }
          idx++;

       }
    }

    public static void main(String[] args) {
        int[] arr ={0};
        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(arr);
        for(int val:arr){
            System.out.println(val);
        }
    }
}

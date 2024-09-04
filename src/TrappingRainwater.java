public class TrappingRainwater
{

    // https://leetcode.com/problems/trapping-rain-water/description/
    public static int trap(int[] height) {

        int left = 0;
        int right = height.length-1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
         int totalWater = 0;
        while(left<right){

          if(height[left]<=height[right]){
              if(leftMax>height[left]){
                  totalWater += (leftMax - height[left]);
              }
              else  leftMax = height[left];

              left++;
          }
          else {
              if(rightMax>height[right]){
                  totalWater += (rightMax - height[right]);

              }
              else rightMax = height[right];
              right--;
          }

        }
return totalWater;

    }


    public static void main(String[] args) {

    }


}

public class JUmp {


    // https://leetcode.com/problems/jump-game/description/
    public static boolean canJump(int[] nums) {

        int maxPos = 0;

        for(int i=0;i<nums.length;++i){

            if(i>maxPos)return false;

            maxPos = Math.max(maxPos,i+nums[i]);

        }

        return true;

    }


    public static void main(String[] args) {

        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }

}

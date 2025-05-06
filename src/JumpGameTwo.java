public class JumpGameTwo {



    // https://leetcode.com/problems/jump-game-ii/description/
    public static int jump(int[] nums) {


        int n = nums.length;
        if(n==1)return 0;

        int count = 0 ;
        int farthest = 0;
        int range = 0;

        for(int i=0;i<n;++i){
            farthest  = Math.max(nums[i] + i,farthest );
            if(i==range){
                count++;
                range = farthest;
                if(range>=n-1)return count;
            }
        }

        return count;
    }

    public static void main(String[] args) {
            int[] arr = {2,3,1,1,4};
        System.out.println(jump(arr));
    }

}

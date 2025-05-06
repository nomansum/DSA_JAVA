public class TrapRainWaterPractice {









    public static int trap(int[] height) {



        int l = 0;
        int r = height.length-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(l<r){

            lmax = Math.max(height[l],lmax);
            rmax = Math.max(height[r],rmax);

            if(lmax<rmax){
                ans += (lmax-height[l]);
                l++;

            }
            else {
                ans+=(rmax-height[r]);
                r--;
            }


        }
return ans;

    }


















}

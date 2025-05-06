public class sqrtx {




    // https://leetcode.com/problems/sqrtx/description/?envType=study-plan-v2&envId=top-interview-150

    public int mySqrt(int x) {
        if( x==0) return 0;
        int root = 1;
        int ans = root;
        while((long)root*root<=(long)x){
            ans = root;
            root++;
        }
        return ans;

    }

// apply binary search here .





}

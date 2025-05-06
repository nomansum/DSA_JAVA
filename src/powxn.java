public class powxn {

    // https://leetcode.com/problems/powx-n/description/

    public static double myPowIteration(double x, int n) {

        double ans = 1.0;
        long power = n;
        if(power<0) power = -1 * power;

        while(power>0){
            if((power&1)==1){
                ans = ans * x;
                power--;
            }
            else{
                x = x * x;
                power /= 2;
            }
        }
        if(n<0) ans = (double)(1.0)/(double)(ans);

        return ans;
    }


    public static double myPow(double x, int n) {

        double ans = 1.0;
        long power = n;
        if(power<0) power = -1 * power;
       ans = usingRecursion(x,(int)power);
        if(n<0) ans = (double)(1.0)/(double)(ans);
        return ans;

    }
    public static double usingRecursion(double x , int n){
       // double ans = 1.0;
        if(n==0) return (double)(1.0);
        System.out.println(n);
        if((n&1)==1){

         return    x*usingRecursion(x,n-1);
        }
        else {
             double half = usingRecursion(x,n/2);
             return half * half;

        }

    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0,10));
    }
}

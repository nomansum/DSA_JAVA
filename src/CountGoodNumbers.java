public class CountGoodNumbers {
    // https://leetcode.com/problems/count-good-numbers/solutions/5434502/easy-solution-beats-100-fast-exponentiation-java/
    public static int countGoodNumbers(long n) {


     long even = (n+1)/2;
     long odd = n - even;
       // System.out.println(even);
      long modulo = (long) (1000000007);

      long result = (long) ((myPow(4,odd,modulo)%modulo * myPow(5,even,modulo)%modulo)%modulo);

      return (int) ((int) result%modulo);

    }


    public static long myPow(long x,long n,long modulo){

      long ans = 1;

      while(n>0){

          if((n&1)==1){
              ans = ((ans%modulo) * (x%modulo))%modulo;
              n--;
          }
          else {
             x = ((x%modulo) * (x%modulo)) %modulo;
              n/=2;
          }

      }

    return ans;

    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));

    }
}

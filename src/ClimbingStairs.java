public class ClimbingStairs {

//https://leetcode.com/problems/climbing-stairs/description/

//    public static int climbStairs(int n) {
//
//   if(n==0){
//       return 1;
//   }
//   else if(n<0){
//       return 0;
//   }
//
//  return   climbStairs(n-1) + climbStairs(n-2);
//
//    }

    public static int climbStairs(int n){

      int[] arr = new int[n+2];

      arr[1] = 1;
      arr[2] = 2;
      for(int i = 3;i<=n;++i){
          arr[i] = arr[i-1] + arr[i-2];
      }
        return arr[n];
    }

    public static void main(String[] args) {

        System.out.println(climbStairs(1));

    }
}

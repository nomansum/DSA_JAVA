import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 class Outer {
   static int nonStaticValue = 5;
  static int returnMe(){
      return 1;
  }
     static class StaticInner {
        void display(Outer outer) {
            System.out.println("Accessing Outer class value: " + outer.nonStaticValue);
        }
    }
}


class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void display() { // ERROR: Cannot override the final method from Parent
    //     System.out.println("Overriding final method.");
    // }
}



public class FrogJumpPractice {


    public static int frogJump(int n, int heights[]) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.contains(1);

        ArrayList<Integer> arr = new ArrayList<>();


        return solve(dp,heights,n);

    }


    public static int solve(int[] dp ,int[] heights, int n){

   if (n == 0) return 0;
   if(dp[n]!=-1) return dp[n];

   int jumpTwo = Integer.MAX_VALUE;
   int jumpOne = solve(dp,heights,n-1) + Math.abs(heights[n]-heights[n-1]);
   if(n>1) jumpTwo = solve(dp,heights,n-2) + Math.abs(heights[n]-heights[n-2]);


   return dp[n] = Math.min(jumpOne,jumpTwo);

    }

    public static void main(String[] args) {
      Child obj = new Child();
      obj.display();
    }



}

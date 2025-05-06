import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BurstBalloons {




    public static int solve(int[][] dp , ArrayList<Integer> arr , int i, int j,boolean flag){

        if(i>j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int result = Integer.MIN_VALUE;

        for(int p=i;p<=j;++p){

            if(flag==true){
                result = Math.max(result,solve(dp,arr,i,p-1,true)+solve(dp,arr,p+1,j,true)+(arr.get(i-1)*arr.get(j+1)));

            }
            else {
                result = Math.max(result,solve(dp,arr,i,p-1,true)+solve(dp,arr,p+1,j,true)+arr.get(p));

            }


        }

return dp[i][j] = result;

    }




    public static void main(String[] args) {

        int n ;
        Scanner scanner = new  Scanner(System.in);
        n= scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;++i){
            arr.add(scanner.nextInt());
        }
        arr.addFirst(1);
        arr.addLast(1);
        int[][] dp = new int[110][110];
        for(int[] val:dp)Arrays.fill(val,-1);

        System.out.println(solve(dp,arr,1,n,false));

    }





}

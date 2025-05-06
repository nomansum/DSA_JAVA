import java.util.*;
import java.io.*;

public class RangeSumofBST {



    public int rangeSumBST(TreeNode root, int low, int high) {

        int[] sum = new int[1];


        solve(root,low,high,sum);
        return sum[0];

    }
    private void solve(TreeNode root, int low,int right,int[] sum){

        if(root==null  ) return ;

        if(root.val>=low && root.val<=right){
            sum[0]+=root.val;
        }


        solve(root.left,low,right,sum);
        solve(root.right,low,right,sum);


    }



}

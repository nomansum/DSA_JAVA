import java.util.Collections;

public class MinimumAbsoluteDifferenceInBST {





    public int getMinimumDifference(TreeNode root) {


        int[] arr = {Integer.MAX_VALUE,Integer.MAX_VALUE};
        inorder(root,arr);
        return arr[0];

    }


public void inorder(TreeNode root,int[] arr){

        if(root==null) return ;

        inorder(root.left,arr);

        arr[0] = Math.min(arr[0],Math.abs(root.val-arr[1]));
        arr[1] = root.val;

        inorder(root.right,arr);




}







}

import java.util.ArrayList;
import java.util.List;

public class RIghtSideViewOfBinaryTree {




    // https://leetcode.com/problems/binary-tree-right-side-view/description/
    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> rightViewNodes = new ArrayList<>();

      recursiveTraverse(root,0,rightViewNodes);
return rightViewNodes;

    }


public static void recursiveTraverse(TreeNode root,int level,List<Integer> rightViewNodes){

        if(root==null){
            return ;
        }

        if(level == rightViewNodes.size()){
            rightViewNodes.add(root.val);
        }

        recursiveTraverse(root.right,level+1,rightViewNodes);
        recursiveTraverse(root.left,level+1,rightViewNodes);

}





    public static void main(String[] args) {

    }






    public class TreeNode {
        int val;
        TreeNode left;TreeNode right;
        int hd;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }





}

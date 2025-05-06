public class SubtreeofAnotherTree {







    public boolean isSubtree(TreeNode root, TreeNode subRoot) {


       return   solve(root,subRoot);

    }

    public boolean solve(TreeNode root, TreeNode subRoot){

        if(root==null) return false;

        return isSubRoot(root,subRoot) || solve(root.left,subRoot) || solve(root.right,subRoot);


    }

    public boolean isSubRoot(TreeNode root, TreeNode subRoot){

        if(root == null && subRoot==null) return true;

         if(root==null || subRoot==null) return false;

        if(root.val!=subRoot.val) return false;

        return isSubRoot(root.left,subRoot.left) && isSubRoot(root.right,subRoot.right);




    }





}

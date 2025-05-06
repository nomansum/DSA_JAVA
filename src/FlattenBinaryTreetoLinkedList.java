public class FlattenBinaryTreetoLinkedList {






    // https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
    public static  void flatten(TreeNode root) {
   TreeNode curr = root;
   while(curr!=null){
       if (curr.left != null) {
           TreeNode prev = curr.left;

           while(prev.right!=null){
               prev = prev.right;
           }
           prev.right = curr.right;
           curr.right = curr.left;
           curr.left=null;

       }
       curr = curr.right;
   }
    }




    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }






}

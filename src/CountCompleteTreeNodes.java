public class CountCompleteTreeNodes {

    // https://leetcode.com/problems/count-complete-tree-nodes/description/
    public static  int countNodes(TreeNode root) {

        if(root == null) return 0;

        int left = getLeftHight(root.left);
        int right = getRightHight(root.right);

        if(left==right) return ((2<<(left))-1);

        return 1+countNodes(root.left) + countNodes(root.right);


    }


    public static int getLeftHight(TreeNode root){
        int count = 1;
          if(root==null)return 0;

        while(root.left!=null){
            count++;
            root= root.left;
        }
        System.out.println(count);

        return count;

    }
    public static int getRightHight(TreeNode root){
        int count = 1;
        if(root==null)return 0;

        while(root.right!=null){
            count++;
            root= root.right;
        }
        System.out.println(count);
        return count;

    }

    public static void main(String[] args) {
         TreeNode root = new TreeNode(1,null,null);

        root.left = new TreeNode(2,null,null);
        root.right = new TreeNode(3,null,null);
        root.left.left = new TreeNode(4,null,null);
        root.left.right = new TreeNode(5,null,null);
        root.right.left = new TreeNode(6,null,null);

        System.out.println(countNodes(root));
    }

    public static  class TreeNode {
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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {
    // https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>>result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
       if(root == null)return result;
        queue.offer(root);
        int flag = 0;

        while(!queue.isEmpty()){

        int n = queue.size();
        List<Integer> sublist = new ArrayList<>();

        for(int i = 0;i<n;++i){

            TreeNode curr = queue.poll();

            if(flag==0) sublist.addLast(curr.val);
            else sublist.addFirst(curr.val);
            if(curr.left!=null)queue.offer(curr.left);
            if(curr.right!=null)queue.offer(curr.right);


        }
      flag ^=1;
    result.add(sublist);

        }
return result;
    }


    public class TreeNode {
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






    public static void main(String[] args) {

    }
}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {


    // https://leetcode.com/problems/binary-tree-level-order-traversal/description/
    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> levelOrderNodes  = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
          if(root== null)return levelOrderNodes;
        queue.offer(root);
        List<Integer> rootSublist = new ArrayList<>();

        rootSublist.add(root.val);
        levelOrderNodes.add(rootSublist);

        while(!queue.isEmpty()){

            int val = queue.peek().val;
            int nodes  = queue.size();
            List<Integer> sublist  = new ArrayList<>();
           // queue.poll();
           for(int i=0;i<nodes;++i){

               if(queue.peek().left!=null){
                   queue.offer(queue.peek().left);
                   sublist.add(queue.peek().left.val);
               }
               if(queue.peek().right!=null){
                   queue.offer(queue.peek().right);
              sublist.add(queue.peek().right.val);
               }

               queue.poll();

           }
               if(!sublist.isEmpty())     levelOrderNodes.add(sublist);


        }

return levelOrderNodes;

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



}

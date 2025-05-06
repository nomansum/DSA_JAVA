import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {

    // https://leetcode.com/problems/maximum-width-of-binary-tree/description/
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null)return 0;

        int ans = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));



        while(!queue.isEmpty()){
            int size = queue.size();
            int mmin = queue.peek().num;
            int first = 0;
            int last = 0;

            for(int i=0;i<size;++i){
                int current =  queue.peek().num;
                TreeNode currentNode = queue.peek().node;
                queue.poll();

                if(i==0)first = current;
                if(i==size-1)last = current;
                if(currentNode.left!=null){
                    queue.offer(new Pair(currentNode.left,current*2+1));
                }
                if(currentNode.right!=null){
                    queue.offer(new Pair(currentNode.right,current*2+2));
                }

            }
            ans = Math.max(ans,last-first+1);



        }

        return ans;
    }
    class Pair{
        TreeNode node;
        int num;
        Pair(TreeNode node,int num){
            this.node = node;
            this.num = num;
        }
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
   byte a = 122;
   int b = 3;

   switch (b){

       case 2:
           System.out.println(2);
       default:
           System.out.println(4);
           break;
       case 3:
           System.out.println(3);





   }

    }
}

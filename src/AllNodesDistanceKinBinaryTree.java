import java.util.*;

public class AllNodesDistanceKinBinaryTree {


    // https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/description/
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode,TreeNode> parent_track = new HashMap<>();

        markParents(root,parent_track,root);

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(target);

        Map<TreeNode,Boolean> visited = new HashMap<>();

        visited.put(target,true);
        int curLevel = 0;
       while (!queue.isEmpty()){

           int size = queue.size();
           if(curLevel == k) break;
           curLevel++;
           for(int i=0;i<size;++i){
               TreeNode current = queue.poll();
               if(current.left!=null &&  visited.get(current.left) == null){
                   queue.offer(current.left);
                   visited.put(current.left,true);
               }
               if(current.right!=null &&  visited.get(current.right) == null){
                   queue.offer(current.right);
                   visited.put(current.right,true);
               }
               if(parent_track.get(current)!=null && visited.get(parent_track.get(current))==null){
                   queue.offer(parent_track.get(current));
                   visited.put(parent_track.get(current),true);
               }

           }

       }
       List<Integer> result = new ArrayList<>();
       while(!queue.isEmpty()){
           TreeNode current = queue.poll();
           result.add(current.val);
       }


return result;

    }
    public static void markParents(TreeNode root, Map<TreeNode,TreeNode> parent_track,TreeNode target){


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            if(current.left!=null){
                parent_track.put(current.left,current);
                queue.offer(current.left);
            }
            if(current.right!=null){
                parent_track.put(current.right,current);
                queue.offer(current.right);
            }
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


}

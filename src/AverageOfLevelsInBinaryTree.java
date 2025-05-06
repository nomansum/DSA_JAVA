import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

class Edge{
    int to , weight;
    Edge(int to,int weight){
        this.to  = to;
        this.weight = weight;
    }
}
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Edge> adjacencyList = new ArrayList<>();
        List<Double> list = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        int total = 1;
        queue.offer(root);

        while(!queue.isEmpty()){

            total = queue.size();
            Double avr = 0.0;
            for(int i=0;i<total;++i){
                TreeNode temp = queue.poll();
                if(temp.left!=null)queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
                avr += (temp.val*1.00);
            }

       list.add(avr/(1.00*total));


        }


return list;
    }





}

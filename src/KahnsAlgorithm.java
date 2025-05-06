import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnsAlgorithm {



public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adjList){


    int[] inderee = new int[V];

    for(int i=0;i<V;++i){
        for(int it: adjList.get(i)){
            inderee[it]++;
        }
    }

    Queue<Integer> queue = new LinkedList<>();

    for(int i=0;i<V;++i){
        if(inderee[i]==0) queue.offer(i);
    }
    int topo[] = new int[V];
    int t = 0;
    while (!queue.isEmpty()){
        int node = queue.peek();
        queue.remove();
        topo[t++] = node;
        for(int it: adjList.get(node)){
            if(--inderee[it]==0){
                queue.add(it);
            }
        }
    }

return  topo;

}









}

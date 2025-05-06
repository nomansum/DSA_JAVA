import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortAlgo {


    public  static int[] toposort(int V, ArrayList<ArrayList<Integer>> adjList)
    {

int[] visited = new int[V];

Stack<Integer> stack = new Stack<>();
  for (int i=0;i<V;++i){

      if(visited[i]==0){
          dfs(i,visited,stack,adjList);
      }

  }

  int ans[] = new int[stack.size()];
  /// empty the stack and push these into ans.
  return ans;




    }


    public  static void dfs(int node, int[] visited , Stack<Integer> stack,ArrayList<ArrayList<Integer>> adjList){

      visited[node]=1;
      for(int i=0;i<adjList.get(node).size();++i){
          int newNode = adjList.get(node).get(i);

          if(visited[newNode]==1){
              dfs(newNode,visited,stack,adjList);
          }


      }

      stack.push(node);


    }


}

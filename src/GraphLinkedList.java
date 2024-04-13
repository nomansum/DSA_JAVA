import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphLinkedList {



    private LinkedList<Integer>[] adj;
    private int V;
    private int E;


    public GraphLinkedList(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0;i<nodes;++i){
            this.adj[i] = new LinkedList<>();
        }
    }
  public void addEdge (int u , int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        this.E++;
  }
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        sb.append(V + " vertices, " + E +" edges \n");
        for (int v = 0;v<V;++v){
            sb.append(v + ": ");
            for (int w : adj[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs (int s){
        boolean[] visited = new boolean[this.V];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);
        while(!q.isEmpty()){
            int u = q.poll();
            System.out.println(u + " ");
            for (int v:this.adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    q.offer(v);
                }
            }
        }
    }

    public void dfs(int s){
        boolean[] visited = new boolean[this.V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        while(!stack.isEmpty()){
            int u = stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.println(u + " " );
                for(int v:adj[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }
public   void dfs(int v , boolean[] visited){
        visited[v] = true;
    System.out.println(v + " ");
    for(int w:this.adj[v]){
        if(!visited[w]){
            dfs(w,visited);
        }
    }
}

public int[] connectedComponents(){
        boolean[] visited  = new boolean[this.V];
        int[] compId = new int[V];
        int count = 0;
        for(int v=0;v<this.V;++v){
            if(!visited[v]){
                dfs(v,visited,compId,count);
                count++;
            }
        }
        return compId;
}
public  void dfs(int v , boolean[] visited  , int[] compId , int count){
        visited[v] = true;
        compId[v] = count;
        for(int w:adj[v]){
            if(!visited[w]){
                dfs(w,visited,compId,count);
            }
        }
}




    public static void main(String[] args) {
        GraphLinkedList g = new GraphLinkedList(6);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(5,4);
        g.bfs(0);
        System.out.println(g);
        g.dfs(0,new boolean[g.V]);
      int[] connectedTrack =   g.connectedComponents();
        System.out.println(connectedTrack[5] + " "+connectedTrack[3]);
    }
}

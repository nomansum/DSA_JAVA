import java.util.ArrayList;

public class IsGraphBipartite {

    //  https://leetcode.com/problems/is-graph-bipartite/description/
    public static  boolean isBipartite(int[][] graph) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for(int i=0;i<graph.length;++i){
            adjList.add(new ArrayList<>());
            for(int j=0;j<graph[i].length;++j){
                    adjList.get(i).add(graph[i][j]);
            }
        }
         int[] color = new int[graph.length];

        for(int i =0 ;i<color.length;++i){
            color[i]=-1;
        }
        for(int i=0;i<color.length;++i){
            if(color[i]==-1)
            {
                if(dfs(adjList,color,0,i)==false)return false;

            }

        }

return true;

    }


    public static boolean dfs(ArrayList<ArrayList<Integer>> adjList , int[] color,int nodeColor,int node){

        color[node] = nodeColor;

        for(int i=0;i<adjList.get(node).size();++i){

            int newNode = adjList.get(node).get(i);

            if(color[newNode]==-1){
                if(dfs(adjList,color,nodeColor^1,newNode)==false)return false;
            }
            else if(color[newNode]==nodeColor){
                return false;
            }

        }
        return true;


    }




    public static void main(String[] args) {

    }



}

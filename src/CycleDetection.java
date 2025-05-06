import java.util.ArrayList;

public class CycleDetection {


    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adjList){

        boolean[] isVisited = new boolean[V];
        boolean[] isPathTaken = new boolean[V];

        for(int i=0;i<V;++i){

            if(isVisited[i]==false){
                if(dfsCheck(i,adjList,isVisited,isPathTaken)==true) return true;

            }

        }
        return false;


    }

    public static boolean dfsCheck(int node,ArrayList<ArrayList<Integer>>adjList,boolean[] isVisited,boolean[] isPathTaken){

        isVisited[node] = true;
        isPathTaken[node] = true;

        for(int i=0;i<adjList.get(node).size();++i){
            int newNode = adjList.get(node).get(i);
            if(isVisited[newNode]==false){

                if(dfsCheck(newNode,adjList,isVisited,isPathTaken)==true)return true;


            }
            else if(isPathTaken[newNode])return true;
        }

        isPathTaken[node]=false;
        return false;

    }




}

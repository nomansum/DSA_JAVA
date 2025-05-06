import java.util.ArrayList;

public class NumberOfProvinces {


    // https://leetcode.com/problems/number-of-provinces/description/
    public static int findCircleNum(int[][] isConnected) {
        int size = isConnected.length;

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        int total = 0;
        boolean[] isVisited = new boolean[size];
        for(int i=0;i<size;++i){
            adjList.add(new ArrayList<>());
           for(int j=0;j<size;++j){
               if(isConnected[i][j]==1){
                   adjList.get(i).add(j);
               }
           }

        }


        for(int i =0 ;i<size;++i){
            if(!isVisited[i]){
                dfs(adjList,isVisited,i);
                total++;
            }
        }

return total;

    }
public static void dfs(ArrayList<ArrayList<Integer>> adjList,boolean[] isVisited,int node){

        if(isVisited[node]==true){
            return;
        }
        isVisited[node] = true;

        for(int i=0;i<adjList.get(node).size();++i){
            dfs(adjList,isVisited,adjList.get(node).get(i));
        }


}

    public static void main(String[] args) {
     int[][] arr = {{1,1,0},{1,1,0},{0,0,1}};
     findCircleNum(arr);

    }


}

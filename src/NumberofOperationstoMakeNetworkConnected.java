import java.util.ArrayList;

public class NumberofOperationstoMakeNetworkConnected {


    



    //  https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/
    public static int makeConnected(int n, int[][] connections) {

        DisjointSet ds = new DisjointSet(n);
        int extraEdges = 0;
        for(int[] values:connections){

            int u = values[0];
            int v = values[1];
            if(ds.findPar(u)==ds.findPar(v)){
                extraEdges++;
            }
            else {
                ds.unionBySize(u,v);
            }


        }
        int totalComponents = 0;
        for(int i=0;i<n;++i){
            if (ds.parent[i]==i) totalComponents++;
        }
        int result = totalComponents-1;
        if(extraEdges>=result) return result;
        return -1;


    }


    





}

class DisjointSet {

    public int[] rank , parent, weight ;

    public DisjointSet(int n){
        rank = new int[n+1];
        parent = new int[n+1];
        weight = new int[n+1];
        for(int i=0;i<=n;++i){
            parent[i] = i;
            weight[i] = 1;
        }
    }

    int findPar(int node){
        if(node==parent[node])return node;
        return parent[node] = findPar(parent[node]);
    }
//
//    void unionByRank (int u,int v){
//        int vParent = findPar(v);
//        int uParent = findPar(u);
//        if(uParent==vParent) return;
//        if(rank[uParent]>rank[vParent]){
//            parent[vParent] = uParent;
//
//        }
//        else parent[uParent] = vParent;
//    }
    void unionBySize(int u,int v){

        int uParent = findPar(u);
        int vParent = findPar(v);
        if(uParent==vParent)return;
        if(weight[uParent]<weight[vParent]){
            parent[uParent] = vParent;
            weight[uParent] += weight[vParent];
        }
        else{
            parent[vParent] = uParent;
            weight[vParent] += weight[uParent];

        }

    }


}
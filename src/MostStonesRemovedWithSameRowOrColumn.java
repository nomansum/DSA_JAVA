import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class MostStonesRemovedWithSameRowOrColumn {

    //  https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/description/
    public int removeStones(int[][] stones) {

       int maxRow = 0;
       int maxCol  = 0;
       for(int[] val:stones){
           maxRow = Math.max(maxRow,val[0]);
           maxCol = Math.max(maxCol , val[1]);
       }
       DisjointSetUnion ds  = new DisjointSetUnion(maxCol+maxRow+1);

        HashMap<Integer,Integer> stoneNodes = new HashMap<>();

        for(int[] val : stones){

            int nodeRow = val[0];
            int nodeCol  = val[1]+maxRow+1;
            ds.unionBySize(nodeRow,nodeCol);
            stoneNodes.put(nodeRow,1);
            stoneNodes.put(nodeCol,1);

        }
        int cnt = 0;

        for(Map.Entry<Integer,Integer> it:stoneNodes.entrySet()){
            if(ds.findPar(it.getKey())== it.getKey()) cnt++;
        }

return stones.length-cnt;




    }


}


class DisjointSetUnion {

    public int[] rank , parent, weight ;

    public DisjointSetUnion(int n){
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
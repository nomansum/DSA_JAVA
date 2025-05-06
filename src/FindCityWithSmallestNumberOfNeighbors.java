import java.util.Arrays;

public class FindCityWithSmallestNumberOfNeighbors {

    // https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance




public void floydWarshall(int[][] dist,int n){

    for(int k=0;k<n;++k){

        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){

                dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);

            }
        }


    }


}


    public int findTheCity(int n, int[][] edges, int distanceThreshold) {


    int[][] dist = new int[n][n];

    for(int i=0;i<n;++i){
        Arrays.fill(dist[i],(int)1e8+1);
    }

    for(int[] edge :edges){
        int start = edge[0];
        int end = edge[1];
        int weight = edge[2];
        dist[start][end] = weight;
        dist[end][start] = weight;
    }
    floydWarshall(dist,n);

    int ans = -1;

    int minCity  = Integer.MAX_VALUE;

    for(int i=0;i<n;++i){
        int count = 0;
        for(int j=0;j<n;++j){
            if(i!=j && dist[i][j]<=distanceThreshold)count++;
        }
        if(count<=minCity){
            ans = i;
            minCity=count;
        }
    }

    return  ans;

    }








}

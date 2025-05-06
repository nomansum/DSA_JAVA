import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NumberOfWaysToArriveAtDestination {


    //https://leetcode.com/problems/number-of-ways-to-arrive-at-destination

    public int countPaths(int n, int[][] roads) {

        class Pair{
            long a;
            long b;
            Pair(long a ,long b){
                this.a = a;
                this.b = b;
            }
        }

        PriorityQueue<Pair> q = new PriorityQueue<>((x,y)->Long.compare(x.a,y.a));

        List<List<Pair>> adj = new ArrayList<>();

        for(int i=0;i<n;++i){
            adj.add(new ArrayList<>());
        }
        for(int[] arr:roads){
            int start = arr[0];
            int finish = arr[1];
            int weight = arr[2];
            adj.get(start).add(new Pair(finish,weight));
            adj.get(finish).add(new Pair(start,weight));

        }

        long[] distance = new long[n];
        int[] ways = new int[n];
        Arrays.fill(distance,Long.MAX_VALUE/2);
        distance[0]  = 0;
        ways[0] = 1;
        q.add(new Pair(0,0));

        while (!q.isEmpty()){
            long currentNode = q.peek().b;
            long dist = q.peek().a;
            q.poll();
            for(Pair i:adj.get((int)currentNode)){
                long edgeWeight = i.b;
                long nextNode = i.a;
                if(edgeWeight+dist<distance[(int)nextNode]){
                    distance[(int)nextNode] = edgeWeight+dist;
                    q.add(new Pair(edgeWeight+dist,nextNode));
                    ways[(int)nextNode] = ways[(int)currentNode];
                }
                else if(edgeWeight+dist==distance[(int)nextNode]){
                    ways[(int)nextNode] = (ways[(int) nextNode] + ways[(int)currentNode]) % ((int)1e9+7);

                }
            }
        }
   return ways[n-1] % ((int)1e9+7);

    }

}

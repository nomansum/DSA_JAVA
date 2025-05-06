import java.util.*;

public class FindEventualSafeStates {


    //https://leetcode.com/problems/find-eventual-safe-states/description/

    public static List<Integer> eventualSafeNodes(int[][] graph) {

      List<List<Integer>>  adjRev = new ArrayList<>();

      for(int i=0;i<graph.length;++i){
          adjRev.add(new ArrayList<>());
      }
      class Pair{
          int x;
          int y;
      }
PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x,y)-> x.x-y.x);
      int[] indegree = new int[graph.length];

      for(int i=0;i<graph.length;++i){

          for(int val:graph[i]){
              adjRev.get(val).add(i);
              indegree[i]++;
          }

      }

        Queue<Integer> queue = new LinkedList<>();
      List<Integer> safeNodes = new ArrayList<>();

      for(int i=0;i<graph.length;++i){
          if(indegree[i]==0)queue.offer(i);
      }

      while (!queue.isEmpty()){

          int node = queue.poll();

          safeNodes.add(node);

          for(int val:adjRev.get(node)){
              if(--indegree[val]==0)queue.offer(val);
          }


      }


        Collections.sort(safeNodes);
 return safeNodes;

    }








}

import java.util.*;

public class NetworkDelayTime {




    // https://leetcode.com/problems/network-delay-time/
    public int networkDelayTime(int[][] times, int n, int k) {

        Map<Integer,List<int[]>> map = new HashMap<>();

        for(int[] time:times){
            int start = time[0];
            int end = time[1];
            int timeTaken  = time[2];
            map.putIfAbsent(start,new ArrayList<>());
            map.get(start).add(new int[]{end,timeTaken});
        }

        int[] timeTaken = new int[n+1];
        Arrays.fill(timeTaken,Integer.MAX_VALUE);
        timeTaken[k] = 0;

        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{k,0});

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int currentNode = current[0];
            int currentTimeTaken= current[1];

            if(map.get(currentNode)!=null){

                for(int[] next:map.get(currentNode)){
                    int nextTimeTaken = next[1];
                    int nextNode = next[0];
                    if(currentTimeTaken+nextTimeTaken<timeTaken[nextNode]){
                        timeTaken[nextNode] = currentTimeTaken+nextTimeTaken;
                        queue.offer(new int[]{nextNode,currentTimeTaken+nextTimeTaken});
                    }

                }

            }

        }

int result = 0;
        for(int i=1;i<=n;++i){
            result = Math.max(result,timeTaken[i]);
        }
return result==Integer.MAX_VALUE?-1:result;
    }








}

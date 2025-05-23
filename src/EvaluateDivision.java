import java.util.*;

public class EvaluateDivision {

class Pair <K,V>{
    K key;
    V value;
    Pair(K key, V value){
        this.key = key;
        this.value  = value;
    }
    public  K getKey() {return key;}
    public V getValue() {return value;}
}



    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
Map<String,Map<String ,Double>> graph = buildGraph(equations,values);

double[] results = new double[queries.size()];
for(int i=0;i<queries.size();++i){
    List<String> query = queries.get(i);
    String dividend = query.get(0);
    String divisor = query.get(1);
    if(!graph.containsKey(dividend)||!graph.containsKey(divisor)){
        results[i] = -1.0;
    }
    else results[i] = bfs(dividend,divisor,graph);
}



return results;


    }


    public Map<String,Map<String,Double>> buildGraph(List<List<String>>equations,double[] values){

        Map<String,Map<String ,Double>> graph = new HashMap<>();
        for(int i=0;i<equations.size();++i){

            List<String > equation = equations.get(i);
            String dividend = equation.get(0);
            String  divisor = equation.get(1);
            double value = values[i];
            graph.putIfAbsent(dividend,new HashMap<>());
            graph.putIfAbsent(divisor,new HashMap<>());
            graph.get(dividend).put(divisor,value);
            graph.get(divisor).put(dividend,1.0/value);


        }
        return graph;

    }
public double bfs(String start, String end, Map<String,Map<String,Double>> graph){

        Queue<Pair<String,Double>>  queue = new LinkedList<>();
         Set<String> visited = new HashSet<>();
         queue.offer(new Pair<>(start,1.0));

         while (!queue.isEmpty()){

             Pair<String,Double> pair = queue.poll();
             String node = pair.getKey();
             double value  = pair.getValue();

             if(node.equals(end))return value;

             visited.add(node);
             for(Map.Entry<String,Double> neighbour:graph.get(node).entrySet() ){

                 String neighbourNode = neighbour.getKey();
                 double neighbourValue = neighbour.getValue();
                 if(!visited.contains(neighbourNode)){
                     queue.offer(new Pair<>(neighbourNode,value*neighbourValue));
                 }

             }



         }

return -1.0;
}



}

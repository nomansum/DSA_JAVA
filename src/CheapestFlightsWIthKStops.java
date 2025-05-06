import java.util.*;

public class CheapestFlightsWIthKStops {



    // https://leetcode.com/problems/cheapest-flights-within-k-stops/
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] cheapestPrices = new int[n];
        Map<Integer, List<int[]>> adjacencyMap  = new HashMap<>();

        Arrays.fill(cheapestPrices,Integer.MAX_VALUE);

        cheapestPrices[src] = 0;

        for(int[] flight:flights){
            adjacencyMap.computeIfAbsent(flight[0],key->new ArrayList<>()).add(new int[] {flight[1],flight[2]});

        }

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[] {src,0,0});


        while(!queue.isEmpty()){

            for(int i= queue.size();i>0;--i){

                int[] currentFlight = queue.poll();
                int currentCity = currentFlight[0];
                int currentPrice = currentFlight[1];
                int stops = currentFlight[2];

                if(adjacencyMap.get(currentCity) !=null){

                    for(int[] flight:adjacencyMap.get(currentCity)){
                        int nextCity = flight[0];
                        int newPrice = currentPrice+flight[1];

                        if(newPrice< cheapestPrices[nextCity] && stops<=k){
                            cheapestPrices[nextCity] = newPrice;
                            queue.offer(new int[]{nextCity,newPrice,stops+1});
                        }


                    }


                }


            }


        }
   return cheapestPrices[dst] == Integer.MAX_VALUE?-1:cheapestPrices[dst];
    }







}

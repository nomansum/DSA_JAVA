import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DetectCycleInADirectedGraph {

    @Override
    public boolean equals(Object obj){
        return true;
    }

    public static int mx = (int) (1e5 + 4);
    public static ArrayList<Integer> ansV =  new ArrayList<>();
    public static int ans = Integer.MAX_VALUE;

    public static int sum(ArrayList<Integer> b) {
        int sum = 0;
        for (Integer val : b) sum += val;
        return sum;

    }

    public static void detect(int s, ArrayList<Integer> b, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {

        visited[s] = true;
        b.add(s);

        for (Integer node : adj.get(s)) {
            if (visited[node] == false) {
                detect(node, b, visited, adj);
            } else {
                if (b.get(0) != node) {
                    continue;
                }
                if (sum(b) < ans) {
                    ans = sum(b);
                 ansV = new ArrayList<>(b);
                }
            }
        }

        visited[s] = false;
       b.remove(b.size()-1);

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
         for(int i=0;i<=n;++i){
             adj.add(new ArrayList<>());
         }
        boolean[] visited = new boolean[mx];
        while((m--)>0){
            int a, b;
            a = scanner.nextInt();
            b= scanner.nextInt();
            adj.get(a).add(b);

        }

        for(int i=1;i<=n;++i){
           // ArrayList<Integer> ans = new ArrayList<>();
          //  Arrays.fill(visited,false);
            detect(i,new ArrayList<Integer>(),visited,adj);

        }
    // Collections.sort(ansV);
   ansV.sort((a,b)->Integer.compare(a,b));
        for(Integer val:ansV) {
            System.out.print(val + " ");
        }


    }
}

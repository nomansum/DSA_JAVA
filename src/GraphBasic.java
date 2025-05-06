public class GraphBasic {



    public class Graph{
        int[][] adjMatrix;
        public Graph(int nodes){
            this.adjMatrix = new int[nodes][nodes];
        }
        public void addEdge(int u , int v){
            this.adjMatrix[u][v] = 1;
            this.adjMatrix[v][u] = 1;
        }
    }




    public static void main(String[] args) {

    }
}

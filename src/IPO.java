import java.util.PriorityQueue;

public class IPO {

class Project {
    public int pro;
    public int cap ;
    public Project(int pro,int cap){
        this.pro = pro;
        this.cap = cap;
    }
}


    public int findMaximizedCapital(int k,
                                    int w, int[] profits,
                                    int[] capital) {

        PriorityQueue<Project> minHeap = new PriorityQueue<>((a,b)->a.cap-b.cap);
        PriorityQueue<Project> maxHeap = new PriorityQueue<>((a,b)->b.pro-a.pro);


        for(int i=0;i<capital.length;++i){
            minHeap.offer(new Project(profits[i],capital[i]));
        }

        while(k-- >0){

            while(!minHeap.isEmpty() && minHeap.peek().cap<=w){
                maxHeap.offer(minHeap.poll());
            }
            if(maxHeap.isEmpty())break;
            w+=maxHeap.poll().pro;

        }


    return w;


    }






}

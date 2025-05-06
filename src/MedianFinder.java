import java.util.PriorityQueue;

public class MedianFinder {

private PriorityQueue<Integer> small = new PriorityQueue<>((a,b)->b-a);
private  PriorityQueue<Integer> large = new PriorityQueue<>();
private  boolean even = true;


    public MedianFinder() {

    }

    public void addNum(int num) {
if(even){
    large.offer(num);
    small.offer(large.poll());
}
else{
    small.offer(num);
    large.offer(small.poll());
}
even = !even;
    }

    public double findMedian() {

        if(even) return (small.peek()+large.peek())/2.0;

        return small.peek();


    }








}

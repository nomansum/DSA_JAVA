import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Interval {

    private int start ;
    private int end;
    public Interval(int start,int end){
        this.start = start;
        this.end = end;
    }

public int getStart(){
        return this.start;
}
public int getEnd(){
        return this.end;
}
    // Q : Given a list of intervals , merge all the overlapping intervals and
    // return a list of non-overlapping intervals.
    // I/O : [{2,6},{1,3},{8,10}]
    //        [{1,6},{8,10}]

  public static   List<Interval> merge(List<Interval>intervals){

      if(intervals.size()<2) return intervals;


        Collections.sort(intervals,new IntervalComparator());

        List<Interval> result = new LinkedList<>();
        Interval first = intervals.get(0);
        int start = first.start;
        int end = first.end;



        for(int i=1;i<intervals.size();++i){
            Interval current  = intervals.get(i);
            if(current.getStart()<=end){
                end = Math.max(current.end,end);
            }
            else{
                result.add(new Interval(start,end));
                start = current.getStart();
                end = current.getEnd();

            }
        }
   result.add(new Interval(start,end));
        return result;

    }




    public static void main(String[] args) {

       List<Interval> list = new ArrayList<>();
        list.add(new Interval(7,9));
       list.add(new Interval(1,3));
        list.add(new Interval(2,6));

        List<Interval> result = merge(list);

    }
}

class IntervalComparator implements java.util.Comparator<Interval> {
    @Override
    public int compare(Interval a, Interval b) {
        return a.getStart() - b.getStart();
    }
}
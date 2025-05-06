import java.util.Stack;
public class MinStack {

    // https://leetcode.com/problems/min-stack/description/
private Stack<Long> st ;
private long minValue;

    public MinStack() {
       st = new Stack<>();
       minValue = Long.MAX_VALUE;
    }

    public void push(int val) {

        if(st.isEmpty()){
            minValue = val;
            st.push((long) val);
        }
        else if(val<minValue){
            st.push((2L *val)-minValue);
            minValue = val;
        }
       else  {
            st.push((long) val);

        }


    }

    public void pop() {

        if(st.peek() < minValue){
            minValue = 2 * minValue - st.pop();
        }
        else {
            st.pop();
        }

    }

    public int top() {
        if(st.peek() < minValue){
            return (int)minValue;
        }
        return st.peek().intValue();
    }

    public int getMin() {
         return (int) minValue;
    }

    public static void main(String[] args) {

    }
}


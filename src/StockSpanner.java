import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StockSpanner {

    Stack<ArrayList<Integer>> stack ;

    int idx = -1;
    //= new Stack<>();
    public StockSpanner() {
        stack = new Stack<>();
        idx = -1;
    }

    public int next(int price) {
        idx = idx + 1;
        while(!stack.isEmpty() && stack.peek().get(0)<= price){
            stack.pop();
        }
        int ans = idx - (stack.isEmpty()?-1:stack.peek().get(1));
        stack.push(new ArrayList<>(Arrays.asList(price,idx)));
         return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
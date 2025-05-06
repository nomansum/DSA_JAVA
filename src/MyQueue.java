import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class MyQueue {

    Stack<Integer> input;

    Stack<Integer> output;
//   boolean flag;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
//        flag = true;
    }

    public void push(int x) {

     input.push(x);


    }

    public int pop() {

         if(!output.isEmpty()){
             return output.pop();
         }
         else {
             while(!input.empty()){
                 output.push(input.pop());
             }

         }

        return output.pop();

    }

    public int peek() {

            if(output.empty() != true)
                output.peek();
            else{
                while(input.empty() == false)
                    output.push(input.pop());
            }
            return output.peek();
        

    }

    public boolean empty() {
    return output.empty() && input.empty();
    }
    
    
}

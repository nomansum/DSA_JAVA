import java.util.EmptyStackException;

public class Stack<S> {

 private ListNode top;
 private int length;


    private class ListNode {
        int data;
        ListNode next;
      public  ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }
   public Stack(){
        this.top = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return this.length==0;
    }
public int length(){
        return this.length;
}
    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = this.top;
        this.top = newNode;
        this.length++;

    }

    public int  pop(){
        if(isEmpty()){
            throw new IllegalArgumentException("Kit");
        }
        ListNode temp = top;
        top = top.next;
        temp.next  = null;
    this.length--;
         return temp.data;
    }

public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.top.data;
}









    public  static  void main(String[] args){

//        Stack stack = new Stack();
//        stack.push(5);
//        System.out.println(stack.peek());
//        stack.push(15);
//        System.out.println(stack.peek());
//        stack.push(115);
//        System.out.println(stack.peek());
//        stack.push(25);
//        System.out.println(stack.peek());
//        stack.push(225);
//        System.out.println(stack.peek());
//        stack.push(35);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());





    }


}

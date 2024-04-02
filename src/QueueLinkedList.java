import java.util.List;
import java.util.NoSuchElementException;

public class QueueLinkedList {

private ListNode front;
private ListNode rear;
private int length;
  private class ListNode{
      private int data;
      private ListNode next;
      public ListNode(int data){
          this.data = data;
          this.next=null;
      }
  }
  public QueueLinkedList(){
      this.front = null;
      this.rear = null;
      this.length = 0;
  }

  public void enqueue(int data){
      ListNode newNode = new ListNode(data);
      if(this.isEmpty()){
          this.front = newNode;
      }
      else{
          this.rear.next = newNode;
      }
      this.rear = newNode;
      this.length++;
  }
  public void print(){
      if(this.isEmpty()){
          return;
      }
      ListNode current = this.front;
      while(current!=null){
          System.out.print(current.data + " --> " );
          current = current.next;
      }
      System.out.println("null");
//      System.out.println("rear " + this.rear.data);

  }

  public  int length(){
      return this.length;
  }
  public boolean isEmpty(){
      return this.length==0;
  }



public int dequeue(){
      if(isEmpty()){
          throw new NoSuchElementException();
      }
      int result = this.front.data;
      front = front.next;
      if(front==null){
          rear = null;
      }
      length--;
      return result;
}





    public static void main(String[] args){
           QueueLinkedList queue = new QueueLinkedList();
           queue.enqueue(2);
           queue.enqueue(4);
           queue.enqueue(6);
           queue.dequeue();
           queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
           queue.print();
    }
}

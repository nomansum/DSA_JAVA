import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

      private ListNode last;
      private int length;

      private  class ListNode{
          private ListNode next;
          private  int data;
          public ListNode(int data){
              this.data = data;
              this.next = null;
          }
      }

      public CircularSinglyLinkedList(){
          this.last = null;
          this.length = 0;
      }


public  int length(){
          return this.length;
}
public boolean isEmpty(){
          return this.length==0;
}
public void insertNodeAtTheBeginningOfACircularSinglyLinkedList(int data){
          ListNode newNode = new ListNode(data);
          if(last == null){
              last = newNode;
          }
          else{
              newNode.next = last.next;
          }
          last.next = newNode;
          this.length++;


}
public void printCircularSinglyLinkedList(){
          if(last == null){
              return ;
    }
    ListNode first = last.next;
          while(first!=last){
              System.out.println(first.data + "-->");
              first = first.next;
          }
          System.out.println(first.data+"-->");
          System.out.println(first.next.data + " END");
}

public void  createCircularLinkedList(){
          ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first;
    this.last = fourth;

}

public void insertElementAtTheEndOfCircularSinglyLinkedList(int data){
          ListNode newNode = new ListNode(data);
          if(last == null){
              last = newNode;
              last.next = last;
          }
          else{
              newNode.next = last.next;
              last.next = newNode;
              last = newNode;
          }
          length++;
}

public ListNode removeFirstNodeFromCircularSinglyLinkedList(){

           if(isEmpty()){
               throw new NoSuchElementException("CLL is already empty!");
           }
           ListNode temp = last.next;

           if(last.next == last){
               last = null;
           }
           else{
               last.next = temp.next;
           }
           temp.next = null;
           length--;
          return temp;
}




    public static void main(String[] args){
          CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
              cll.insertNodeAtTheBeginningOfACircularSinglyLinkedList(2);
              cll.insertElementAtTheEndOfCircularSinglyLinkedList(5);
              cll.insertElementAtTheEndOfCircularSinglyLinkedList(6);
              cll.insertElementAtTheEndOfCircularSinglyLinkedList(9);
              cll.insertNodeAtTheBeginningOfACircularSinglyLinkedList(1);
              cll.printCircularSinglyLinkedList();
    }
}

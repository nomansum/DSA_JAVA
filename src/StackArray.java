public class StackArray {


private int top;
private int[] arr;


public StackArray(int size){
    this.top = -1;
    this.arr = new int[size];
}
public StackArray(){
    this(10);
}


public void push(int data){
    if(isFull()){
        throw  new RuntimeException("Stack is Full");
    }
    this.top++;
    this.arr[this.top] = data;
}
public int pop(){
    if(isEmpty()){
        throw new RuntimeException("Stack is empty!");
    }
    int result = this.arr[this.top];
    this.top--;
    return result;

}

public boolean isFull(){
    return this.arr.length == this.size();
}
public int size(){
    return this.top+1;
}
public boolean isEmpty(){
    return top<0;
}





    public static void main(String[] args){
    int[] arr = new int[10];
    System.out.println(arr[1]);
        System.out.println("here");
    }
}

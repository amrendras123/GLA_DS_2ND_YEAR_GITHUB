/**
 * Queue1
 */
public class Queue1 {

   private int[] arr;
   private int front;
   private int size;

    Queue1(){
        arr=new int[5];
        size=0;
        front=0;
    }
    Queue1(int n){
        arr=new int[n];
        size=0;
        front=0;
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public void enqueue(int val){
        arr[size]=val;
        size++;

    }
    public int dequeue(){

        int rv=arr[front];
        front++;
        return rv;

    }


}
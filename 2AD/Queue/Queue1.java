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
    public void enqueue(int val) throws Exception{ 
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=val;
        size++;

    }
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int rv=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        size--;
        return rv;

    }
    public int getFront() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int rv=arr[front];
        return rv;
    }
    public void Display(){

        for(int i=0;i<size;i++){
             int idx=(front+i)%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }

}
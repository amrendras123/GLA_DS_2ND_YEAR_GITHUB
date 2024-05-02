/**
 * Queue
 */
public class Queue {

    private int[] arr;
    private int front;
    private int size;

    Queue(){
        arr=new int[5];
        front=0;
        size=0;
    }
    Queue(int n){
        arr=new int[n];
        front=0;
        size=0;
    }

    public boolean iSEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }

    public void enqueue(int val) throws Exception{
        if(isFull()){
            throw new Exception("Quueue is full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=val;
        size++;
    }
    public int dequeue() throws Exception{

        if(iSEmpty()){
            throw new Exception("Queuue is Empty");
        }

        int rv=arr[front];
        arr[front]=0;
        front=(front+1)%arr.length;
        size--;
        return rv;
    }
    public int getFront() throws Exception{
        if(iSEmpty()){
            throw new Exception("Queuue is Empty");
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
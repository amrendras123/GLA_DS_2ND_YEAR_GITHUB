public class QueueClient {
    
    public static void main(String[] args) throws Exception {
        
        Queue1 q=new Queue1();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.Display();
        System.out.println(q.dequeue());
        q.Display();
        q.dequeue();
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.Display();

    }
}

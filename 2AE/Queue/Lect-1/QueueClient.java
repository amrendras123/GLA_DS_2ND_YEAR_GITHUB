public class QueueClient {
    
    public static void main(String[] args) throws Exception {
        
        Queue q=new Queue();

        // q.enqueue(10);
        // q.enqueue(20);
        // q.enqueue(30);
        // q.Display();
        System.out.println(q.dequeue());
        // q.Display();
        
    }
}

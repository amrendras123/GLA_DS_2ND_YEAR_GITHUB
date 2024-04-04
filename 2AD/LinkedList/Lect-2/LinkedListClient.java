public class LinkedListClient {
    

    public static void main(String[] args)throws Exception {
        LinkedList ll=new LinkedList();
        ll.addFirst(5);
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(12);
        ll.addFirst(31);
        ll.addLast(13);
        ll.addAt(3, 16);
        ll.addAt(0, 100);
        // ll.removeFirst();
        ll.removeLast();
        ll.Display();
    }
}

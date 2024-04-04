

public class LinkedListClient {
    
    public static void main(String[] args) throws Exception {

        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        // ll.Display();
        ll.addFirst(30);
        ll.adddLast(50);
        ll.adddLast(100);
        ll.addAt(4, 55);
        ll.addAt(1, 5);
        // ll.removeFirst();
        // ll.removeLast();
        ll.removeAt(4);
        // ll.size=1000;
        // ll.head=null;
        ll.Display();
        ll.reverseByValue();
        ll.Display();
        

    
    }
}

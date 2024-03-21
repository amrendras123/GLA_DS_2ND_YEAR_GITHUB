public class LinkedListClient {
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(5);
        ll.addFirst(15);
        ll.addLast(25);
        ll.addFirst(26);
        ll.addLast(100);
        ll.addAt(2, 13);
        ll.addAt(0, 50);
        ll.addAt(8, 68);

        ll.display();
    }
}

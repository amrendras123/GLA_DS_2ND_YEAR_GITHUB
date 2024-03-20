/**
 * LinkedList
 */
public class LinkedList {

    class Node{
        int data;
        Node next;
        }
    private Node head;
    private Node tail;
    int size;

    public  void addFirst(int val){
         Node nn=new Node();
         nn.data=val;
         if(size==0){
            head=nn;
            tail=nn;
            size++;
         }else{
            nn.next=head;
            head=nn;
            size++;
         }

    }
    public void addLast(int val){
        Node nn=new Node();
         nn.data=val;
         if(size==0){
            addFirst(val);
         }else{
            tail.next=nn;
            tail=nn;
         }
    }
    public void Display(){
          Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        }
    }
    
}
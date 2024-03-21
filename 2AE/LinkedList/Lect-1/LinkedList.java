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

    public void addFirst(int val){
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
            size++;
        }
    }
    public Node getNode(int idx){
       Node temp=head;

        for(int i=0;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void addAt(int i,int val){
        Node nn=new Node();
        nn.data=val;
        Node min1=getNode(i-1);
        // Node plus1=getNode(i);
        Node plus1=min1.next;

        if(i==0){
            addFirst(val);
        }else if(i==size){
            addLast(val);
        }
        else{
        
        min1.next=nn;
        nn.next=plus1;
        size++;
        }


    }
    public void removeFirst(){

    }
    public void removeLast(){

    }
    public void removeAt(int i){
        
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }


}
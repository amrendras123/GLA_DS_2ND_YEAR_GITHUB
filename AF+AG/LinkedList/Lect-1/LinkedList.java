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
     //O(1)
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
    //O(1)
    public void adddLast(int val){
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
    //O(n)
    public Node getNode(int idx){

        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    //O(n)
    public void addAt(int idx,int val){
        Node nn=new Node();
        nn.data=val;
        if(idx==1){
            addFirst(val);
        }else if(idx==size){
            adddLast(val);
        }else{
            Node min1=getNode(idx-1);
            Node plus1=min1.next;
            min1.next=nn;
            nn.next=plus1;
            size++;
        }

    }
    public void removeFirst() throws Exception{
        if(size==0){
            throw new Exception("LinkedList empty hai");
        }
        head=head.next;
        size--;
    }
    public void removeLast(){

    }
    public void removeAt(int idx){
        
    }
    public void Display(){
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("_______________________________-");
    }



}
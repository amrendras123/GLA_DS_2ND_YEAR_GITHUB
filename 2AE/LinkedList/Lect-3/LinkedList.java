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
    private int size;
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

    //O(n)
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
   // O(1)
    public void removeFirst() throws Exception{

        if(size==0){
            throw new Exception("list is empty");
        }
        if(size==1){
            head=null;
            tail=null;
            size--;
        }else{
        head=head.next;
        size--;
        }

    }
    //O(n)
    public void removeLast() throws Exception{

     if(size==0){
        throw new Exception("list is empty");
     }
     if(size==1){
        head=null;
        tail=null;
        size--;
     }else{
        Node last_2nd=getNode(size-2);
        last_2nd.next=null;
        tail=last_2nd;
        size--;
     }
    }
    //O(n)
    public void removeAt(int i) throws Exception{

        if(i<0){
            throw new Exception("index is not valid");
        }
       else if(i==0){
            removeFirst();
        }else if(i==size){
            removeLast();
        }else{
            Node min1=getNode(i-1);
            min1.next=min1.next.next;
            size--;

        }
        
    }
    //O(n)
    public void middleNode() {

        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.data);
        
    }
    //reverse of LinkedList by swapping tha data
    public void reverseBySwapping(){

        int left=0;
        int right=size-1;

        while(left<=right){
            Node ln=getNode(left);
            Node rn=getNode(right);

            int temp=ln.data;
            ln.data=rn.data;
            rn.data=temp;
            left++;
            right--;
        }
    }
    //O(n)
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("*******************************");
    }


}
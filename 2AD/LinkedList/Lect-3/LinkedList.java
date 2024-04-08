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
  //O(n)
    public Node getNodeAt(int idx){
    
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
      if(idx==0){
         addFirst(val);
      }else if(idx==size){
         addLast(val);
      }else{
         Node min1=getNodeAt(idx-1);
         Node plus1=min1.next;
         min1.next=nn;
         nn.next=plus1;
         size++;

      }
    }
    public int removeFirst() throws Exception{

      if(size==0){
         throw new Exception("LinkeList is Empty ");
      }
      Node temp=head;
      if(size==1){
         head=null;
         tail=null;
         size=0;

      }else{
      head=head.next;
      temp.next=null;
      size--;
      }
      return temp.data;
    }
    public int removeLast() throws Exception{

      if(size==0){
         throw new Exception("LinkeList is Empty ");
      }
      Node temp=head;
      if(size==1){
         head=null;
         tail=null;
         size=0;
      }else{
      Node min1=getNodeAt(size-1);
      temp=min1.next;
      min1.next=null;
      size--;
      }
      return temp.data;

    }
    //O(n)
    public int removeAt(int idx)throws Exception{
      if(idx==1){
          removeFirst();
      }else if(idx==size){
         removeLast();
      }
      Node min1=getNodeAt(idx-1);
      Node temp=min1.next;
      min1.next=min1.next.next;
      temp.next=null;
      return temp.data;
    }

    public void Display(){
          Node temp=head;
        while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        }
    }
    
}
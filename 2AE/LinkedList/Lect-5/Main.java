import java.util.Scanner;

/**
 * Odd_even
 */
public class Main {

    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void addLast(int val){
        Node nn=new Node(val);
        if(size==0){
            head=nn;
            tail=nn;
            size=1;
        }else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void middle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
   

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Main ll=new Main();
    

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            ll.addLast(x);
        }
        
        
    }
}


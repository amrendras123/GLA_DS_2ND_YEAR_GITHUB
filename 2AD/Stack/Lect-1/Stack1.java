/**
 * Stack
 */
public class Stack1 {

   private int[] arr;
   private int tos=-1;

   Stack1(){
    arr=new int[5];
   
   }
   Stack1(int n){
    arr=new int[n];
   }

   public int size(){
    return tos+1;
   }
   public void push(int val)throws Exception{

    if(tos==arr.length-1){
        throw new Exception("Stack .is Full");
    }
    tos++;
    arr[tos]=val;
   }
   public boolean isEmpty(){
    return tos==-1;
   }
   public int  pop()throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is empty");
    }
    int temp=arr[tos];
    arr[tos]=0;
    tos--;
    return temp;

   }
   public int peek() throws Exception{
    if(isEmpty()){
        throw new Exception("Stack is empty");
    }
    return arr[tos];
   }
   public void display(){
    for(int i=tos;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }

   
}
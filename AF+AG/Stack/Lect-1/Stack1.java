class Stack1{

   private int[] arr;
   private int tos=-1;;

    Stack1(){
        arr=new int[5];
    }
    Stack1(int n){
        arr=new int[n];
    }
    public void push(int val)throws Exception{
        if(isFull()){
            throw new Exception("Stack is Full");
        }
        tos++;
        arr[tos]=val;
    }
    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("stack is Empty");
        }

        int temp=arr[tos];
        arr[tos]=0;
        tos--;
        return temp;

    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is Empty");
        }
        return arr[tos];
    }
    public boolean isEmpty(){
        return tos==-1;
    }
    public boolean isFull(){
        return tos==arr.length-1;
    }

    public void display(){
        for(int i=tos;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
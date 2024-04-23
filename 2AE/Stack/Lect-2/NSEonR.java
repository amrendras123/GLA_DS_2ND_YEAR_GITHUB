import java.util.Stack;

public class NSEonR {
    
    

    public static void main(String[] args) {
        
        int[] arr={1,5,6,2,3,7};
        NSER(arr);
    }
    public static void NSER(int[] arr){

        int[] ans=new int[arr.length];

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[st.peek()]>arr[i]){

                ans[st.peek()]=arr[i];
                st.pop();

            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+"->"+ans[i]);
        }

    }



    public static void nge(int[] arr){
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+"->"+ans[i]);
        }
    }
}
import java.util.Stack;

/**
 * NGEonRight
 */
public class NGEonRight {

    public static void main(String[] args) {
        int[] arr={4,3,2,5,7,8,9,10,8,7,6};
        NGEL(arr);
    }
    public static void NGER(int[] arr){

        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){

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
    public static void NGEL(int[] arr){

        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){

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
}
import java.util.Stack;

public class NGER {
    
    public static void main(String[] args) {
        
        int[] arr={6,5,4,12,13,2,1,4,5};
        // NGE(arr);
        // NGEstack(arr);
        // NGEleft(arr);
        NSEright(arr);

    }
    public static void NGE(int[]arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]+"->"+arr[j]);
                    break;
                }
            }
        }
    }
    public static void NGEstack(int[] arr){

        int[] ans=new int[arr.length];

        Stack<Integer>  st=new Stack<>();

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){

            ans[st.peek()]=arr[i];
            st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+"->"+ans[i]);
        }
        }
        public static void NGEleft(int[] arr){

            int[] ans=new int[arr.length];
    
            Stack<Integer>  st=new Stack<>();
    
            for(int i=arr.length-1;i>=0;i--){
    
                while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
    
                ans[st.peek()]=arr[i];
                st.pop();
                }
                st.push(i);
            }
            while(!st.isEmpty()){
                ans[st.peek()]=-1;
                st.pop();
            }
            for(int i=0;i<ans.length;i++){
                System.out.println(arr[i]+"->"+ans[i]);
            }
            }
            public static void NSEright(int[] arr){

                int[] ans=new int[arr.length];
        
                Stack<Integer>  st=new Stack<>();
        
                for(int i=0;i<arr.length;i++){
        
                    while(!st.isEmpty()&&arr[i]<arr[st.peek()]){
        
                    ans[st.peek()]=arr[i];
                    st.pop();
                    }
                    st.push(i);
                }
                while(!st.isEmpty()){
                    ans[st.peek()]=-1;
                    st.pop();
                }
                for(int i=0;i<ans.length;i++){
                    System.out.println(arr[i]+"->"+ans[i]);
                }
                }
}


/**
 * Min_flip
 */
import java.io.*;
import java.util.*;
public class Min_flip {


    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here   
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                
            }else if(ch=='}' &&st.peek()=='{'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        
        int o=0,c=0;
        while(!st.isEmpty()){
            char ch=st.peek();
            if(ch=='{'){
            o++;
            st.pop();
            } else if(ch=='}'){
            c++;
            st.pop();
            }
        }
       // System.out.println(o +" "+c);
        if(o%2==0&&c%2==0){
            return o/2+c/2;
        }else if(o%2==1&&c%2==1){
            return (o-1)/2+2+(c-1)/2;
        }else 
        return -1;
    }
}

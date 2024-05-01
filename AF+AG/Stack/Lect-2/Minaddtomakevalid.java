import java.util.Stack;

public class Minaddtomakevalid {
    class Solution {
    public int minAddToMakeValid(String s) {
         
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                st.push(ch);
            }else if(!st.isEmpty()&&ch==']'&&st.peek()=='['){
                st.pop();
            }else if(!st.isEmpty()&&ch=='}'&&st.peek()=='{'){
                st.pop();
            }else if(!st.isEmpty()&&ch==')'&&st.peek()=='('){
                st.pop();
            }else{
                st.push(ch);
            }

        }
        return st.size();
    }
}
}

import java.util.*;

public class Palindrome_Partioning {
    
    public static void main(String[] args) {
        List<List<String>> ans=new List<>();
        List<String> ll=new List<>();

        Part("aab",ll,ans);
    }
    public static void Part(String ques,List<String> ll,List<List<String>> ans){

        if(ques.length()==0){
            ans.add(new ArrayList<>(ll));
            return ;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0, i);
            if(isPalindrome(s))
            ll.add(s);
            Part(ques.substring(i),ll,ans);
            ll.remove(ll.size()-1);
        }
    }
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

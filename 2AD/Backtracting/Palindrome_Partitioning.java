public class Palindrome_Partitioning {
    
    public static void main(String[] args) {
        part("aab","");
    }
    public static void part(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0, i);
            if(isPalindrome(s)==true){
            part(ques.substring(i), ans+s+"|");
            }
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

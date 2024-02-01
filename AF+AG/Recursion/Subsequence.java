public class Subsequence {
    
    public static void main(String[] args) {
        
        sub("abc","");
        System.out.println(count);
    }
    static int count=0;
    public static void sub(String s,String ans){
      
        if(s.length()==0){
            System.out.println(ans);
            count++;
            return ;
        }

        char ch=s.charAt(0);
        sub(s.substring(1),ans);
        sub(s.substring(1), ans+ch);
    }
}

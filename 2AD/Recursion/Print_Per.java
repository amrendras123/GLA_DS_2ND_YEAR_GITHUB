public class Print_Per {
    
    public static void main(String[] args) {
        per("abcd","");
    }
    public static void per(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String s1=s.substring(0, i);
            String s2=s.substring(i+1);
            per(s1+s2, ans+ch);
        }
    }
}

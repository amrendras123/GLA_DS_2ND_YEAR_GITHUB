public class Generate_Permutation {
    
    public static void main(String[] args) {
        per("abca","");
    }
    public static void per(String s,String  ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            boolean flag=false;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(j)==ch){
                    flag=true;
                    break;

                }
            }
            if(flag==false){
            String a=s.substring(0, i);
            String b=s.substring(i+1);
            per(a+b, ans+ch);
            }
        }
    }
}

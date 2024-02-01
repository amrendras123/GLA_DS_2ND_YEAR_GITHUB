public class Letter_Combination {
    static String press[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static void main(String[] args) {
        
        generate("23","");
    }
    public static void generate(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        int idx=ch-48;
        String s1=press[idx];
        for(int i=0;i<s1.length();i++){
            generate(ques.substring(1), ans+s1.charAt(i));
        }
    }
}

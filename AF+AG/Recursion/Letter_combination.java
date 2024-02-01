public class Letter_combination {
    static String[] press={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static void main(String[] args) {
        Letter_Print("24","");
    }
    public static void Letter_Print(String digits,String ans){
        if(digits.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=digits.charAt(0);
        int idx=ch-48;
        String s1=press[idx];

        for(int i=0;i<s1.length();i++){
            Letter_Print(digits.substring(1), ans+s1.charAt(i));
        }
    }
}

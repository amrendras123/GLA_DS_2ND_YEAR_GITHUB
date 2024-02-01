public class Generate_Paren {
    
    public static void main(String[] args) {
        generate(3,0,0,"");
        System.out.println(count);
    }
    static int count=0;
    public static void generate(int n,int op,int cl,String ans){
      
        if(op==n&&cl==n){
            System.out.println(ans);
            count++;
            return;
        }
       
        if(op<n)
        generate(n, op+1, cl, ans+"(");
        if(op>cl)
        generate(n, op, cl+1, ans+")");
    }
}

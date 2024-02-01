public class Generate_Paranthesis {
    
    public static void main(String[] args) {
        
        para(3,0,0,"");
    }
    public static void para(int n,int op,int cl,String ans){

        if(op==n&&cl==n){
            System.out.println(ans);
            // return;
        }

        if(op<n)
        para(n, op+1, cl, ans+"(");
        if(op>cl)
        para(n, op, cl+1, ans+")");
    }
}

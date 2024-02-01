public class Count_Valid_paranthesis {
    
        public static void main(String[] args) {
           System.out.println(generate(3,0,0,""));
            // System.out.println(count);
        }
        
        public static int generate(int n,int op,int cl,String ans){
          
            if(op==n&&cl==n)  { 
               return 1;
            }
           
            if(op<n){
           int a= generate(n, op+1, cl, ans+"(");
            }
            if(op>cl){
           int b=generate(n, op, cl+1, ans+")");
            }
            return a+b;
        }
    }
    
    


public class PD {
    
    public static void main(String[] args) {
        
    }
    public static void pd(int n){
      
        if(n==0){
            return ;
        }

        pd(n-1);
        System.out.println(n);
        
    }
}

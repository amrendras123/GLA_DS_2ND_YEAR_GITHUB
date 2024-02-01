public class Pow {
    
    public static void main(String[] args) {
        
        int x=2,n=3;
        System.out.println(pow(x,n));
    }
    public static int pow(int x,int n){
        if(n==0){

            return 1;
        }

        int sp=pow(x,n-1);

        return x*sp;
    }
}

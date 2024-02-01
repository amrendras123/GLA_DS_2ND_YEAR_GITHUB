public class Fibonacci {
    
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n){
        
        if(n==0||n==1){
            return n;
        }

        int sp1=fib(n-1);
        int sp2=fib(n-2);

        return sp1+sp2;
    }
}

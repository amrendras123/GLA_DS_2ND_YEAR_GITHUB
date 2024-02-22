public class Climb_Stair {
    
    public static void main(String[] args) {
        
        int n=10;
        
        System.out.println(climb(n));
    }
    // static int count=0;
    public static int  climb(int n){
        if(n==0){
         return 1;
        }
        if(n<0){
            return 0;
        }


       int a= climb(n-1);
       int b= climb(n-2);
       return a+b;
    }
}

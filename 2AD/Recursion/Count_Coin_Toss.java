public class Count_Coin_Toss {
    
    public static void main(String[] args) {
       System.out.println(coin(10));
  
    }
// static int count = 0;
    public static int coin(int n) {
        if(n==0){
           
            return 1;
        }

       int a= coin(n-1);
        int b=coin(n-1);
        return a+b;
        
    }

}

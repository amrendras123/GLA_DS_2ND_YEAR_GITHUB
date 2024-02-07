public class Coin_Change {
    public static void main(String[] args) {
        System.out.println(coin(0,11));
    }
    public static int coin(int curr,int n){
        if(curr==n)
        return 1;
        if(curr>n)
        return 0;


       int a= coin(curr+1, n);
        int b=coin(curr+2, n);
       int c= coin(curr+5, n);
       return a+b+c;

    }
}

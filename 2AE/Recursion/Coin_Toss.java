public class Coin_Toss {
    
    public static void main(String[] args) {
        coin(10,"");
    }
    public static void coin(int n,String ans){

        if(n==0){
            System.out.println(ans);
            return;
        }
        coin(n-1, ans+"H");
        coin(n-1, ans+"T");
    }

}

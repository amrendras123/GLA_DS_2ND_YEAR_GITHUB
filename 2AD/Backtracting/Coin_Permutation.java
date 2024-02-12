public class Coin_Permutation {
    
    public static void main(String[] args) {
        
        int[] coins={1,2,3};
        int amount=4;
        per(coins,amount,"");
    }
    public static void per(int[] coins,int amount,String ans){

        if(amount==0){
            System.out.println(ans);
            return;
        }
       
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                amount=amount-coins[i];
            per(coins, amount, ans+coins[i]);
            amount=amount+coins[i];
            }
        }
    }
}

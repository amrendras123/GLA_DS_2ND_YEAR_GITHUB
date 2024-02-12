public class Coin_Combination {
    public static void main(String[] args) {
        
        int[] coins={1,2,3};
        int amount=4;
        per(coins,amount,"",0);
    }
    public static void per(int[] coins,int amount,String ans,int idx){

        if(amount==0){
            System.out.println(ans);
            return;
        }
       
        for(int i=idx;i<coins.length;i++){
            if(amount>=coins[i]){
                amount=amount-coins[i];
            per(coins, amount, ans+coins[i],i);
            amount=amount+coins[i];
            }
        }
    }

}

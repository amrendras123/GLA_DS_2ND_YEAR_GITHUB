public class Coin_Permutatin {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int amount=4;

        per(arr,amount,"");
    }
    public static void per(int[] arr,int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(amount>=arr[i]){
                amount-=arr[i];
                per(arr, amount, ans+arr[i]);
                amount+=arr[i];
            }
        }
    }
}

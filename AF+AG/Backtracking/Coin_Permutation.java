public class Coin_Permutation {
    
    public static void main(String[] args) {
        int[] arr={2,3,5};
        per(arr,10,"");
    }
    public static void per(int[] arr,int amount,String ans){

        if(amount==0){
            System.out.println(ans);
            return;
        }
        if(amount<0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            per(arr, amount-arr[i], ans+arr[i]);
        }
    }
}

public class Coin_Combination {
    public static void main(String[] args) {
        int[] arr={2,3,1};
        per(arr,4,"",0);
    }
    public static void per(int[] arr,int amount,String ans,int idx){

        if(amount==0){
            System.out.println(ans);
            return;
        }
        if(amount<0){
            return;
        }
        for(int i=idx;i<arr.length;i++){
            per(arr, amount-arr[i], ans+arr[i],i);
        }
    }
}

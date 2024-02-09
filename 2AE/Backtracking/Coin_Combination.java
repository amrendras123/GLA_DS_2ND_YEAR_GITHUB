public class Coin_Combination {
    
        public static void main(String[] args) {
            int[] arr={1,2,3};
            int amount=4;
    
            Combination(arr,amount,"",0);
        }
        public static void Combination(int[] arr,int amount,String ans,int idx){
            if(amount==0){
                System.out.println(ans);
                return;
            }
            for(int i=idx;i<arr.length;i++){
                if(amount>=arr[i]){
                    amount=amount-arr[i];
                    Combination(arr,amount , ans+arr[i],i);
                    amount=amount+arr[i];//backtracking step

                }
            }
        }
    }
    

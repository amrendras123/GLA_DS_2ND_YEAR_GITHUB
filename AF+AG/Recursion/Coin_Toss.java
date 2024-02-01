public class Coin_Toss {
    public static void main(String[] args) {
        
        C_Toss(10,"");
    }
    public static void C_Toss(int n,String ans){
      
        if(n==0){
            System.out.println(ans);
            return ;
        }
         if(ans.length()==0||ans.charAt(ans.length()-1)!='H'){
        C_Toss(n-1, ans+"H");
         }
        C_Toss(n-1, ans+"T");
    }
}

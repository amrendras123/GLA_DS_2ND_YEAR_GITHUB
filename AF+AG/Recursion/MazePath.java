public class MazePath {
    public static void main(String[] args) {
        print(10,"");
    }
    public static void print(int n,String ans){
          
        if(n==0){
            System.out.println(ans);
            return ;

        }
        if(n<0){
            return ;
        }
        for(int dice=1;dice<=6;dice++){
            print(n-dice, ans+dice);
        }
       

    }
}

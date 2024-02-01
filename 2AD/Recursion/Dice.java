public class Dice {

    public static void main(String[] args) {
        dice(10,"");
    }
    public static void dice(int n,String ans){

        if(n==0){
            System.out.println(ans);
            return;
        }
        if(n<0){
            return ;
        }
      

        for(int dic=1;dic<=6;dic++){
            dice(n-dic, ans+dic);
        }
        // dice(n-1, ans+"1");
        // dice(n-2, ans+"2");
        // dice(n-3, ans+"3");


    }
}

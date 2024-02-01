public class MazePath {
    
    public static void main(String[] args) {
        mazePath(50, "");
        System.out.println(count);
    }
    static int count=0;
    public static void mazePath(int n,String ans){
       if(n==0){
        count++;
        // System.out.println(ans);
        return;
       }
       if(n<0){
        return;
       }
       for(int dice=1;dice<=6;dice++){
        mazePath(n-dice, ans+dice);
       }
    //    mazePath(n-1, ans+"1");
        // mazePath(n-2, ans+"2");
        // mazePath(n-3, ans+"3");
    }
}

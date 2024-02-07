public class Lexog {
    public static void main(String[] args) {
        generate_Lexo(0,1000);
    }
    public static void generate_Lexo(int curr,int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);
        int i;
        if(curr==0){
            i=1;
        }else{
            i=0;
        }
        for(;i<=9;i++){
            generate_Lexo(curr*10+i, n);
        }
    }
}

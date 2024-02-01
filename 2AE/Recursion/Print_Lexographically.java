public class Print_Lexographically {

    public static void main(String[] args) {
        lexog(0,13);
    }
    public static void lexog(int curr,int n){

        if(curr>n){
            return ;
        }

        System.out.println(curr);
        int i;
        if(curr==0){
            i=1;
        }else{
            i=0;
        }
        for(;i<=9;i++){
        lexog(curr*10+i, n);
        }
    }
    
}

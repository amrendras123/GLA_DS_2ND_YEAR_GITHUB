public class Count_Lexo {
   
        public static void main(String[] args) {
            
            Lexog(0,1000);
            System.out.println(count);
        }
        static int count=0;
        public static void Lexog(int curr,int n){
    
    if(curr>n){
        return;
    }
            System.out.println(curr);
            count++;
            int i;
            if(curr==0){
                i=1;
            }else{
                i=0;
            }
            for(;i<=9;i++){
                Lexog(curr*10+i,n);
            }
        }
    
}

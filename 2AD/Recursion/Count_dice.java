public class Count_dice {

        public static void main(String[] args) {
           System.out.println(dice(20,""));
        }
        public static int dice(int n,String ans){
    
            if(n==0){
                System.out.println(ans);
                return 1;
            }
            if(n<0){
                return 0;
            }
            int count=0;
            for(int dic=1;dic<=6;dic++){
                count+=dice(n-dic,ans+dic);
            }
            return count;
        }
        
    }
    


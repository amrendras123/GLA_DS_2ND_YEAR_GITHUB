public class Count_mazePath {

        public static void main(String[] args) {
           System.out.println(print(3,""));
        //    System.out.println(count);

        }
        // static int count=0;
        public static int print(int n,String ans){
              
            if(n==0){
                System.out.println(ans);
                return 1;
            }
            if(n<0){
                return 0;
            }
            int count=0;
            for(int dice=1;dice<=3;dice++){
               count+=print(n-dice, ans+dice);
            } 
           return count;
        }
    }
    


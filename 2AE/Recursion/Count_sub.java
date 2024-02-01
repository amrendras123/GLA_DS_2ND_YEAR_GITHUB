public class Count_sub {
    
        public static void main(String[] args) {
           System.out.println(sub("abc"));
            // System.out.println(count);
        }
        // static int count=0;
        public static int sub(String s){
          
            if(s.length()==0){
                return 1;
            }
           int a= sub(s.substring(1));
           int b= sub(s.substring(1));
           return a+b;
        }
    }
    


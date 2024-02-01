public class Count_Sub {
   
        public static void main(String[] args) {
           System.out.println(sub("abc"));
           
        }
       
        public static int sub(String s){
            if(s.length()==0){  
                return 1;
            }
    
          int a=  sub(s.substring(1));
           int b= sub(s.substring(1));
           return a+b;
        }
    
    
}

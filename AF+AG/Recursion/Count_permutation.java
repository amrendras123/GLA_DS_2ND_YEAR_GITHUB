public class Count_permutation {
    
        public static void main(String[] args) {
           System.out.println(per("abc",""));
        }
        public static int per(String s,String  ans){
            if(s.length()==0){
                // System.out.println(ans);
                return 1;
            }
            int cnt=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                boolean flag=false;
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)==ch){
                        flag=true;
                        break;
                    }
                }
                if(flag==false){
                String a=s.substring(0, i);
                String b=s.substring(i+1);
                cnt+=per(a+b, ans+ch);
                }
            }
            return cnt;
        }
    
    
}

public class Rev {
    
    public static void main(String[] args) {
        
  String str="hi";
        int n=12112;
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;//n=n/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
        System.out.println(rev);
    }
}

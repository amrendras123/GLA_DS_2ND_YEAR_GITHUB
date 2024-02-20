public class ClimbStairs {
    public static void main(String[] args) {
        int n=4;
        
        count(4);
        System.out.println(cnt);
    }
    static int cnt=0;
    public static void count(int n){
        if(n==0){
        cnt++;
        return;
        }
        if(n<0){
            return ;
        }
        count(n-1);
        count(n-2);
    }
}

/**
 * Fact
 */
public class Fact {

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
        

    }
    public static int fact(int n){

        if(n==0){//Base case
            return 1;
        }

        int sp=fact(n-1);//smaller problem

        int ans=n*sp;

        return  ans;

    }
}
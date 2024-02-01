public class Toh {
    
    public static void main(String[] args) {
        toh(3,"A","B","C");
    }
    public static void toh(int n,String src,String help,String dest){
        if(n==0){
            return;
        }
        toh(n-1, src, dest, help);
        System.out.println("move "+n +" th disk  from "+src +" to "+dest);
        toh(n-1, help, dest, src);
    }
}

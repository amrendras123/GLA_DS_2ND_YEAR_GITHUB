/**
 * P1
 */
public class P1 {

    public static void main(String[] args) {
        
        // long start=System.currentTimeMillis();
        // for(int i=0;i<1000000;i++){
        // //    System.out.println("hello");
        // }
        // long end=System.currentTimeMillis();
        // System.out.println(end-start);
        int a=10;
        int b=10;
        System.out.println(a+b);
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
      
        // for(int i=0;i<100;i=i*2){
        //     System.out.println("hello");
        // }
        int n=5;
    //TC=O(n^2)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("hello");
            }
        }
        //TC=O(n^2)
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.println("hello");
            }
        }
         //TC=O(N)
        for(int i=0;i<n;i++){
            for(int j=0;j<5;j++){
                System.out.println("hello");
            }
        }
        


    }
}
// package Pattern;

import java.util.Scanner;

public class P1 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int nrow=n;
        int nst=1;
        int nsp=n-1;
        for(int row=1;row<=nrow;row++){

            for(int csp=1;csp<=nsp;csp++){
                System.out.print(" ");
            }

            for(int cst=1;cst<=nst;cst++){
                if(cst%2==0){
                    System.out.print(" ");
                }else
                System.out.print("*");
            }
            System.out.println();
            nst+=2;
            nsp--;
        }
    }
}

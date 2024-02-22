import java.util.Scanner;

public class Subset_recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        subset(arr,k,0,"");
    }
    public static void subset(int[] arr,int k,int idx,String ans){
         if(k==0){
            System.out.println(ans);
            return;
         }
        for(int i=idx;i<arr.length;i++){
            if(k>=arr[i])
            subset(arr, k-arr[i], i+1, ans+arr[i]+" ");
        }
    }
}

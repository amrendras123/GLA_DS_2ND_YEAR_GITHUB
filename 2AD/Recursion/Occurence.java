public class Occurence {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int item=13;
        System.out.println(fn(arr, item, 0));
        
    }
    public static int fn(int[]arr,int x,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
         return fn(arr, x, i+1); 
    }
}

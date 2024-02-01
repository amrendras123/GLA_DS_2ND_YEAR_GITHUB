public class Search {
    
    public static void main(String[] args) {
        int[] arr={2,3,4,3,2,6,7,85,4,9};
        int item=40;
        System.out.println(find(arr, item, 0));
        
    }
    public static int find(int[] arr,int item,int i){
         
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==item){
            return i;
        }
       
        return find(arr, item, i+1);

    }

}

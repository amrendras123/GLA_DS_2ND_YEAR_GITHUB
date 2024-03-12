public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr={12,2,3,7,4,11,13};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int idx=Part(arr,lo,hi);
        sort(arr,lo,idx-1);
        sort(arr, idx+1, hi);
    }
    public static int Part(int[] arr,int lo,int hi){

        int pivot=arr[hi];
        int idx=lo;
        for(int i=lo;i<hi;i++){ 
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }  
        }
        int temp=arr[idx];
        arr[idx]=arr[hi];
        arr[hi]=temp;
        return idx;
    }
}

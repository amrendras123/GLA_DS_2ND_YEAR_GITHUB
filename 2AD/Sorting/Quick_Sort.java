public class Quick_Sort {
    
    public static void main(String[] args) {
        int[] arr={-7,5,2,11,2,3,4,5,6,7};
        sor(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sor(int[] arr,int lo,int hi){
      
        if(lo>=hi){
            return ;
        }
        int idx=Part(arr, lo, hi);
        sor(arr, lo, idx-1);
        sor(arr, idx+1, hi);
    }

    public static int Part(int[] arr,int lo,int hi){
        int pivot=arr[hi];
        int idx=0;
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

/**
 * Merge_Sort
 */
public class Merge_Sort {

    public static void main(String[] args) {
        int[] arr={12,6,3,7,2,11};
        System.out.println("before Sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        divide(arr,0,arr.length-1);
        System.out.println("After Merge Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void divide(int[] arr,int lo,int hi){  
        if(lo>=hi){
            return;
        }
        int mid=(lo+hi)/2;
        divide(arr, lo, mid);
        divide(arr, mid+1, hi);
        Merge(arr,lo,mid,hi);
    }
    public static void Merge(int[] arr,int lo,int mid,int hi){       
        int[] merge=new int[hi-lo+1];
        int idx1=lo;
        int idx2=mid+1;
        int idx=0;
        while(idx1<=mid&&idx2<=hi){

            if(arr[idx1]<arr[idx2]){
                merge[idx]=arr[idx1];
                idx1++;
                idx++;
            }else{
                merge[idx]=arr[idx2];
                idx2++;
                idx++;
            }
        }
        while(idx1<=mid){
            merge[idx]=arr[idx1];
                idx1++;
                idx++;
        }
        while(idx2<=hi){
            merge[idx]=arr[idx2];
            idx2++;
            idx++;
        }

        for(int i=0;i<merge.length;i++){
            arr[lo]=merge[i];
            lo++;
        }
    }
}
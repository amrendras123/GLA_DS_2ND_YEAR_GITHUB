/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr={7,3,5,4,8,2};
        System.out.println("before merge sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Divide(arr,0,arr.length-1);
        System.out.println("after Merge Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void Divide(int[] arr,int lo,int hi){
        if(lo>=hi){
            return;
        }
        int mid=(lo+hi)/2;
        Divide(arr, lo, mid);
        Divide(arr, mid+1, hi);
        Merge(arr,lo,mid,hi);
    }
    public static void Merge(int[] arr,int lo,int mid,int hi){
        int[] result=new int[hi-lo+1];
        int idx1=lo;
        int idx2=mid+1;
        int idx=0;
        while(idx1<=mid&&idx2<=hi){
            if(arr[idx1]<arr[idx2]){
              result[idx]=arr[idx1];
              idx1++;
              idx++;
            }else{
                result[idx]=arr[idx2];
                idx2++;
                idx++;
            }
        }
        while(idx1<=mid){
            result[idx]=arr[idx1];
            idx1++;
            idx++;
        }
        while(idx2<=hi){
            result[idx]=arr[idx2];
                idx2++;
                idx++;
        }

        for(int i=0,j=lo;i<result.length;j++,i++){
            arr[j]=result[i];

        }
    }
}
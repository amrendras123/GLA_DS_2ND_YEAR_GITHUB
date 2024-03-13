class Merge_Sort{

    public static void main(String[] args) {
        
        int[] arr={12,2,5,1,2,6};
        Divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Divide(int[] arr,int lo,int hi){
        if(lo>=hi){
            return ;
        }
        int mid=(lo+hi)/2;

        Divide(arr, lo, mid);
        Divide(arr, mid+1, hi);
        Merge(arr,lo,mid,hi);
    }
    public static void Merge(int[] arr,int lo,int mid,int hi){
        
        int[] result=new int[hi-lo+1];
        int i=lo;
        int j=mid+1;
        int k=0;

        while(i<=mid&&j<=hi){

            if(arr[i]<arr[j]){
                result[k++]=arr[i++];
                // i++;
                // k++;
            }else{
                result[k++]=arr[j++];
            }
        }
        while(i<=mid){
            result[k++]=arr[i++];
        }
        while(j<=hi){
            result[k++]=arr[j++];
        }
       //Copy value to Original array
        for(int m=0;m<result.length;m++){
            arr[lo]=result[m];
            lo++;
        }
    }

}
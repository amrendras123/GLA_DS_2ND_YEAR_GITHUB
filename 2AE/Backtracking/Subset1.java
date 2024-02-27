import java.util.ArrayList;

public class Subset1 {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        sub(nums,ll,ans,0);
        return ans;
        
    }
    public static void sub(int[] arr,List<Integer> ll,List<List<Integer>> ans,int idx){

        ans.add(new ArrayList<>(ll));
        for(int i=idx;i<arr.length;i++){
            ll.add(arr[i]);
             sub(arr,ll,ans,i+1);
            ll.remove(ll.size()-1);

        }


    }

}

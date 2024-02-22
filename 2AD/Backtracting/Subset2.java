import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            
            List<List<Integer>> ans=new ArrayList<>();
            List<Integer> ll=new ArrayList<>();
            Arrays.sort(nums);
            sub(nums,ll,ans,0);
            return ans;
        }
        public static void sub(int[] arr, List<Integer> ll,List<List<Integer>> ans,int idx){
            
            if(!ans.contains(ll))
            ans.add(new ArrayList<>(ll));
            for(int i=idx;i<arr.length;i++){
                ll.add(arr[i]);
                sub(arr,ll,ans,i+1);
                ll.remove(ll.size()-1);  
            }
        }
    }

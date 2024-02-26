public class Unique_Path1 {
    class Solution {
        public int uniquePaths(int m, int n) {
            int count=path(0,0,m-1,n-1);
            return count;
            
        }
        public int path(int cc,int cr,int ec,int er){
    
            if(cc==ec&&cr==er){
                return 1;
            }
            if(cc>ec||cr>er){
                return 0;
            }
           int a= path(cc+1,cr,ec,er);
            int b=path(cc,cr+1,ec,er);
            return a+b;
        }
    }
}

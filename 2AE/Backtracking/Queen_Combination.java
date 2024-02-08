public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] box=new boolean[n];

        Combination(box,tq,0,"",0);
    }
    public static void Combination(boolean[] box,int tq,int qpsf,String ans,int idx){

        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<box.length;i++){
            if(box[i]==false){
                box[i]=true;
                Combination(box, tq, qpsf+1, ans+"b"+i+"q"+qpsf,idx+1);
                box[i]=false;//backtracking

            }
        }
        
    }
}

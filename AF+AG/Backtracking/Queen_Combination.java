public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] box=new boolean[n];
        per(box,tq,0,"",0);
    }
    public static void per(boolean[] box,int tq,int qpsf,String ans,int idx){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<box.length;i++){
            if(box[i]==false){
                box[i]=true;
                per(box, tq, qpsf+1, ans+"b"+i+"q"+qpsf,i+1);
                box[i]=false;//backtracking
            }
        }
    }
}

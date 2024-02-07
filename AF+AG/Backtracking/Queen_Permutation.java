/**
 * Queen_Permutation
 */
public class Queen_Permutation {

    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] box=new boolean[n];
        per(box,tq,0,"");
    }
    public static void per(boolean[] box,int tq,int qpsf,String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<box.length;i++){
            if(box[i]==false){
                box[i]=true;
                per(box, tq, qpsf+1, ans+"b"+i+"q"+qpsf);
                box[i]=false;//backtracking
            }
        }
    }
}
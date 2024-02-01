public class MazePath1 {
    
    public static void main(String[] args) {
        mazePath(0,0,3,3,"");
    }

    public static void mazePath(int cc,int cr,int ec,int er,String ans) {

        if(cc==ec&&cr==er){
            System.out.println(ans);
            return ;
        }
        if(cc>ec||cr>er){
            return ;
        }

        mazePath(cc+1, cr, ec, er, ans+"H");
        mazePath(cc, cr+1, ec, er, ans+"V");

    }
}

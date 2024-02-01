public class MazePath_Print {
    
    public static void main(String[] args) {
        maze(0,0,10,10,"");
    }
    public static void maze(int cc,int cr,int ec,int er,String ans){

        if(cc==ec&&cr==er){
            System.out.println(ans);
            return;
        }
        if(cc>ec||cr>er){
            return;
        }
        maze(cc+1, cr, ec, er, ans+"H");
        maze(cc, cr+1, ec, er, ans+"V");

    }
}

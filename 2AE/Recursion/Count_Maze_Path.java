public class Count_Maze_Path {
    
    public static void main(String[] args) {
       int ans= C_mazePath(0,0,20,21,"");
       System.out.println(ans);
    }

    public static int C_mazePath(int cc,int cr,int ec,int er,String ans) {

        if(cc==ec&&cr==er){
            // System.out.println(ans);
            return 1;
        }
        if(cc>ec||cr>er){
            return 0;
        }

       int hc= C_mazePath(cc+1, cr, ec, er, ans+"H");
        int vc=C_mazePath(cc, cr+1, ec, er, ans+"V");
        return hc+vc;

    }
}

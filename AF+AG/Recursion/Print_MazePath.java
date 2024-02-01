public class Print_MazePath {
    
    public static void main(String[] args) {
        printMaze(0,0,3,3,"");

    }
    public static void printMaze(int cc,int cr,int ec,int er,String ans){

        if(cc==ec&&cr==er){
            System.out.println(ans);
            return;
        }
        if(cc>ec||cr>er){
            return;
        }
        printMaze(cc+1, cr, ec, er, ans+"H");
        printMaze(cc, cr+1, ec, er, ans+"V");
    }
}

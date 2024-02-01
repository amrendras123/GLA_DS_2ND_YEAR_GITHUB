public class Count_Maze {
    
        public static void main(String[] args) {
            maze(0,0,2,2,"");
            System.out.println(count);
        }
        static int count=0;
        public static void maze(int cc,int cr,int ec,int er,String ans){
    
            if(cc==ec&&cr==er){
                System.out.println(ans);
                count++;
                return;
            }
            if(cc>ec||cr>er){
                return;
            }
            maze(cc+1, cr, ec, er, ans+"H");
            maze(cc, cr+1, ec, er, ans+"V");
            maze(cc+1, cr+1, ec, er, ans+"D");
    
        }
    
    
}

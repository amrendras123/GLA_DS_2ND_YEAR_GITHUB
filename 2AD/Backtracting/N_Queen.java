public class N_Queen {
    
    public static void main(String[] args) {
        int n=4;
        int tq=4;
        boolean[][] board=new boolean[n][n];
        Queen(board,0,tq);
    }
    public static void Queen(boolean[][] board,int row,int tq){
        if(tq==0){
            display(board);
            return;
        }
        for(int col=0;col<board[0].length;col++){
            if(isItSafe(board,row,col)){
                board[row][col]=true;
                Queen(board, row+1, tq-1);
                board[row][col]=false;//backtrack steps

            }
        }
    }
    public static boolean isItSafe(boolean[][] board,int row,int col){

        int r=row;
        int c=col;
        //up-left
        while(r>=0&&c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        //up
        r=row;
        c=col;
        while(r>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
        }
        //up-right
        r=row;
        c=col;
        while(r>=0&&c<board[0].length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public static void display(boolean[][] board){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("****************************************************");
    }
}

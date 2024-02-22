public class Soduko_Solver {
    public static void main(String[] args) {
        
        int[][] board={
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
    };
    Solver(board,0,0);
    }
    public static void Solver(int[][] board,int row,int col){

        if(col==board[0].length){
            col=0;
            row=row+1;
        }
        if(row==board.length){
            Display(board);
            return ;
        }
        if(board[row][col]!=0){
            Solver(board, row, col+1);
        }else{
            for(int val=1;val<=9;val++){
                if(isItSafe(board,row,col,val)){
                    board[row][col]=val;
                    Solver(board, row, col+1);
                    board[row][col]=0;
                }
            }
        }
    }
    public static boolean isItSafe(int[][] board,int row,int col,int val){
        //col
        int r=row;
        int c=col;
        for(int j=0;j<board[0].length;j++){
            if(board[r][j]==val){
                return false;
            }
        }
        //row
        r=row;
        c=col;
        for(int j=0;j<board.length;j++){
            if(board[j][c]==val){
                return false;
            }
        }
        //3*3(Matrix)
        int sqrt = (int)(Math.sqrt(board.length)); 
        r=row-row%sqrt;
        c=col-col%sqrt;

        for(int i=r;i<r+sqrt;i++){
            for(int j=c;j<c+sqrt;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    public static void Display(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}

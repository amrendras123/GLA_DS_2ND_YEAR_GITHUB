public class N_Queen {
    public static void main(String[] args) {
        int m=4;
        int n=4;
        int tq=4;
        boolean[][] grid=new boolean[m][n];
        Queen(grid,0,tq);
    }
    public static void Queen(boolean[][] grid,int row,int tq){
        if(tq==0){
         display(grid);
            return;
        }
        for(int col=0;col<grid[0].length;col++){
           if(isitSafe(grid,col,row)){
            grid[row][col]=true;
            Queen(grid, row+1, tq-1);
            grid[row][col]=false;
           }
        }
    }
    public static boolean isitSafe(boolean[][] grid,int col,int row){

        //up-side
        int r=row;
        while(r>=0){
           if(grid[r][col]==true){
            return false;
           }
           r--;
        }
        //left dialgonal
        r=row;
        int c=col;
        while(r>=0&&c>=0){
            if(grid[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        //right up-diagonal
        r=row;
        c=col;
        while(r>=0&&c<grid[0].length){
            if(grid[r][c]==true){
                return false;
            }
            r--;
            c++;
        }

        return true;

    }
    public static void display(boolean[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("**************************************************");
    }
}

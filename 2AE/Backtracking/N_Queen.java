public class N_Queen {
    public static void main(String[] args) { 
        int tq=4;
        int n=4;
        boolean[][] grid=new boolean[n][n];
        Queen(grid,0,tq);
    }
    public static void Queen(boolean[][] grid,int row,int tq){
        if(tq==0){
            display(grid);
            return;
        }
            for(int c=0;c<grid[0].length;c++){
                if(isitSafe(grid,row,c)){
                    grid[row][c]=true;
                    Queen(grid,row+1,tq-1);
                    grid[row][c]=false;//backtracking step
                }
            }
        }
    
    public static boolean isitSafe(boolean[][] grid,int row,int col){
        int r=row;
        int c=col;
         //up
         while(r>=0){
             if(grid[r][c]==true){
                 return false;
             }
             r--;
         }
        r=row;
        c=col;
        //diagonal
        while(r>=0&&c>=0){
            if(grid[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
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
    public static void display(boolean[][] grid){

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("****************************************************");
    }
}

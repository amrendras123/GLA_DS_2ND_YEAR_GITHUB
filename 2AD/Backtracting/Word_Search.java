import java.util.Scanner;

public class Word_Search {
    public static void main(String[] args) {
        char[][] board={
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
         };
         String word="ABCD";

         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(word.charAt(0)==board[i][j]){
                   boolean ans= search(board,word,i,j,0);
                   if(ans){
                    System.out.println(true);
                    return;
                   }
                   
                }
            }
         }
         System.out.println(false);
    
    }
    public static boolean search(char[][] board,String word,int row,int col,int idx){
        if(idx==word.length()){
            return true;
        }

        if(row<0||col<0||row>=board.length||col>=board[0].length||board[row][col]!=word.charAt(idx)){
            return false;
        }
        int r[]={-1,1,0,0};
        int c[]={0,0,-1,1};
        // boolean ans=search(board, word, row-1, col, idx+1)||
        // search(board, word, row+1, col, idx+1)||
        // search(board, word, row, col-1, idx+1)||
        // search(board, word, row, col+1, idx+1);
        board[row][col]='*';
        for(int i=0;i<r.length;i++){
            boolean ans=search(board, word, row+r[i], col+c[i], idx+1);
            if(ans){
                return true;
            }
        }
        board[row][col]=word.charAt(idx);
        return false;

    }

}

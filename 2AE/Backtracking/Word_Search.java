/**
 * Word_Search
 */
public class Word_Search {

    public static void main(String[] args) {
        
        char[][] board={
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'},
         };
         String word="DEF";
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                   boolean ans= Search(board,word,i,j,0);
                   if(ans==true){
                    System.out.println(ans);
                    return;
                   }
                }
            }
         }
         System.out.println(false);
         
    }
    public static boolean Search(char[][] board,String word,int row,int col,int idx){
        if(idx==word.length()){
            return true;
        }
        if(col<0||row<0||col>=board[0].length||row>=board.length||board[row][col]!=word.charAt(idx)){
            return false;
        }
         board[row][col]='*';
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        for(int i=0;i<r.length;i++){
         boolean ans= Search(board, word, row+r[i], col+c[i], idx+1);
         if(ans){
            return true;
         }
        }
        board[row][col]=word.charAt(idx);
        return false;
    }
}
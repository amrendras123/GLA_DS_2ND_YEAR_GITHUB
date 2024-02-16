public class Word_Search {
    public static void main(String[] args) {
         String word="abcd";
        char[][] board=new char[4][4];
        search(board,0,0,word,0);
    }
    public static boolean search(char[][] board,int x,int y,String word,int i){


 if(i==word.length()){
    return true;
 }
        if(x<0||y<0||x>board.length||y>board[0].length){
            return false;
        }
        if(board[x][y]!=word.charAt(i)){
            return false;
        }
       boolean exist= search(board, x+1, y, word, i+1)
        ||search(board, x-1, y, word, i+1)
        ||search(board, x, y+1, word, i+1)
        ||search(board, x, y-1, word, i+1);

        return exist;

    }
}

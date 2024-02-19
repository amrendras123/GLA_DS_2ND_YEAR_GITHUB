import java.util.Scanner;

public class Word_Search {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][] board=new char[m][n];
        for(int r=0;r<m;r++){
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                board[r][i]=s.charAt(i);
            }
        }
        String search=sc.next();
        Word_search(board,search);
    }
    public static void Word_search(char[][] board,String search){

        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                

            }
        }

    }
}

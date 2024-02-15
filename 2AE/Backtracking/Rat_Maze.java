import java.util.Scanner;
public class Rat_Maze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][] maze=new char[m][n];
        for(int i=0;i<m;i++){
            String s=sc.next();
            for(int j=0;j<s.length();j++){
                maze[i][j]=s.charAt(j);
            }
        }
        int[][] ans=new int[m][n];
        Rat_Chase(maze,0,0,ans); 
        if(flag==false){
           System.out.println("NO PATH FOUND");
        }
    }
    static boolean flag=false;
    public static void Rat_Chase(char[][] maze,int row,int col,int[][] ans){
        if(col==maze[0].length-1&&row==maze.length-1&&maze[row][col]!='X'){
            ans[row][col]=1;
            flag=true;
            display(ans);
            return;
        }
        if(col<0||row<0||col>=maze[0].length||row>=maze.length||maze[row][col]=='X'){
            return;
        }
        maze[row][col]='X';
        ans[row][col]=1;

        int[] r={0,0,-1,1};
        int[] c={-1,1,0,0};
        for(int i=0;i<r.length;i++){
            Rat_Chase(maze, row+r[i], col+c[i], ans);
        }
        // Rat_Chase(maze, row, col-1,ans);//left
        // Rat_Chase(maze, row, col+1,ans);//right
        // Rat_Chase(maze, row-1, col,ans);//up
        // Rat_Chase(maze, row+1, col,ans);//down
        maze[row][col]='O';//backtracking
        ans[row][col]=0;//backtracking

    }
    public static void display(int[][] ans){
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

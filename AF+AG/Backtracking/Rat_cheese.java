import java.util.Scanner;

public class Rat_cheese {
    
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
        Maze_Path(maze,0,0,ans);
    }
    public static void Maze_Path(char[][] maze,int cc,int cr,int[][] ans){

        if(cc==maze[0].length-1&&cr==maze.length-1&&maze[cr][cc]!='X'){
            ans[cr][cc]=1;
               display(ans);
               return;
        }
        if(cc<0||cr<0||cc>=maze[0].length||cr>=maze.length||maze[cr][cc]=='X'){
            return ;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        int[]r={0,0,-1,1};
        int[]c={-1,1,0,0};
        for(int i=0;i<r.length;i++){
            Maze_Path(maze, cc+c[i], cr+r[i], ans);
        }
        // Maze_Path(maze, cc-1, cr,ans);//left
        // Maze_Path(maze, cc+1, cr,ans);//right
        // Maze_Path(maze, cc, cr-1,ans);//up
        // Maze_Path(maze, cc, cr+1,ans);//down
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}

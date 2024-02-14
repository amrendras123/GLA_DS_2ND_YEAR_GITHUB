import java.util.Scanner;

public class Ratchase {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        char[][] maze=new char[m][n];
        for(int r=0;r<m;r++){
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                maze[r][i]=s.charAt(i);
            }
        }
        int[][] ans=new int[m][n];
        RatChase_Cheese(maze, 0, 0,ans);
        if(flag==false){
            System.out.println("NO PATH FOUND");
        }
        
    }
    static boolean flag=false;
    public static void RatChase_Cheese(char[][] maze,int cr,int cc,int[][] ans){
        if(cc==maze[0].length-1&&cr==maze.length-1&&maze[cr][cc]!='X'){
            ans[cr][cc]=1;
            flag=true;
            display(ans);
            return;
        }
        if(cc<0||cc>=maze[0].length||cr<0||cr>=maze.length||maze[cr][cc]=='X'){
             return ;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        RatChase_Cheese(maze, cr, cc-1,ans);//left
        RatChase_Cheese(maze, cr, cc+1,ans);//right
        RatChase_Cheese(maze, cr-1, cc,ans);//up
        RatChase_Cheese(maze, cr+1, cc,ans);//down
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

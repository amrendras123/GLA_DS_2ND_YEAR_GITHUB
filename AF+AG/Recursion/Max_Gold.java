class Max_gold {
    public int getMaximumGold(int[][] grid) {
        
        boolean[][] vis=new boolean[grid.length][grid[0].length];
        int out=0,maxi=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    // System.out.println(grid[i][j]);
                    int ans=gold(grid,i,j,vis,out,maxi);
                    maxi=Math.max(ans,maxi);
                }
            }
        }
        return maxi;  
    }
    public int gold(int[][] grid,int row,int col,boolean[][] vis,int out,int maxi){

        if(row<0||col<0||row>=grid.length||col>=grid[0].length||grid[row][col]==0||vis[row][col]==true){
            return Math.max(out,maxi);
        }
        vis[row][col]=true;
        out+=grid[row][col];

        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        for(int i=0;i<r.length;i++){
          int cnt=gold(grid,row+r[i],col+c[i],vis,out,maxi);
           maxi=Math.max(cnt,maxi); 
        } 
        vis[row][col]=false;
        return maxi;
    }
      // // int up=gold(grid,row-1,col,vis,out,maxi);
        // // int down=gold(grid,row+1,col,vis,out,maxi);
        // // int left=gold(grid,row,col-1,vis,out,maxi);
        // // int right=gold(grid,row,col+1,vis,out,maxi);

        // maxi=Math.max(up,Math.max(down,Math.max(left,right)));


}
package Algorithm.Medium;

public class NumberofIslands {
    void dfs(char[][]grid, int x, int y){
        int length=grid.length;
        int width=grid[0].length;

        if(x<0 || y <0 || x>=length || y >= width || grid[x][y]=='0'){
            return;
        }

        grid[x][y]='0';
        dfs(grid,x+1,y);
        dfs(grid,x,y+1);
        dfs(grid,x-1,y);
        dfs(grid,x,y-1);


    }
    public int numIslands(char[][] grid) {
        int result=0;
        if (grid.length==0 || grid[0].length==0){
            return 0;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    result++;
                    dfs(grid,i,j);
                }
            }
        }
        return result;
    }
}

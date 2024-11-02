class Solution {
    void markIsland(char[][] grid, int x, int y, int r, int c){
        if(x<0 || x>=r || y<0 || y>=c || grid[x][y]!='1')   return;

        grid[x][y] = '2';

        markIsland(grid,x+1,y,r,c);
        markIsland(grid,x-1,y,r,c);
        markIsland(grid,x,y+1,r,c);
        markIsland(grid,x,y-1,r,c);

    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        if(row == 0) return 0;
        int col = grid[0].length;

        int noIsland =0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == '1'){
                    markIsland(grid,i,j,row,col);
                    noIsland++;
                }
            }
        }
        return noIsland;
    }
}
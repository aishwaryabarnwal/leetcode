class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1')
                {
                    island++;
                    dissolveOne(grid, i, j);
                }
            }
        }
        return island;
    }
    public void dissolveOne(char[][] grid, int i, int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;
        if(grid[i][j]=='1'){
            grid[i][j] = '0'; //dissolveOne
            dissolveOne(grid, i+1, j);
            dissolveOne(grid, i, j+1);
            dissolveOne(grid, i-1, j);
            dissolveOne(grid, i, j-1);
        }
    }
}
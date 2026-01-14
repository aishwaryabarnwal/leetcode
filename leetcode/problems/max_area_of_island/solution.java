class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1)
                {
                    int area = disolveOne(grid, i, j);
                    maxArea = Math.max(maxArea, area);                    
                }
            }
        }
        return maxArea;
    }
    public int disolveOne(int[][] grid, int i, int j)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return 0;
        grid[i][j] = 0; //disolveOne
        int left = disolveOne(grid, i-1, j);
        int right = disolveOne(grid, i+1, j);
        int up = disolveOne(grid, i, j-1);
        int down = disolveOne(grid, i, j+1);
        return 1 + left + right + up + down;
    }
}
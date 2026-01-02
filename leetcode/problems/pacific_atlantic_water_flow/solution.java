class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for(int col=0;col<n;col++)
        {
            dfs(heights, 0, col, pacific, heights[0][col]);
            dfs(heights, m-1, col, atlantic, heights[m-1][col]);
        }

        for(int row=0;row<m;row++)
        {
            dfs(heights, row, 0, pacific, heights[row][0]);
            dfs(heights, row, n-1, atlantic, heights[row][n-1]);
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(pacific[i][j] && atlantic[i][j])
                    res.add(Arrays.asList(i, j));
            }
        }
        return res;
    }

    public void dfs(int[][] heights, int r, int c, boolean[][] visited, int prevHeight)
    {
        if(r<0 || r>=heights.length || c<0 || c>=heights[0].length || visited[r][c]
            ||  prevHeight > heights[r][c])
            return;
        visited[r][c]= true;
        dfs(heights, r+1, c, visited, heights[r][c]);
        dfs(heights, r-1, c, visited, heights[r][c]);
        dfs(heights, r, c+1, visited, heights[r][c]);
        dfs(heights, r, c-1, visited, heights[r][c]);
    }
}
class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        int m=grid.size();
        int n=grid[0].size();
        for(int i=1;i<m;i++)
            grid[i][0]=grid[i][0]+grid[i-1][0];
        for(int i=1;i<n;i++)
            grid[0][i]=grid[0][i]+grid[0][i-1];
        int i,j;
        int s=0;
        for(i=1;i<m;i++)
        {
            for(j=1;j<n;j++)
            {
                s=min(grid[i-1][j],grid[i][j-1]);
                grid[i][j]=grid[i][j]+s;
            }
        }
        return grid[m-1][n-1];
    }
};
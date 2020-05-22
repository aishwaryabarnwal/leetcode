class Solution {
public:
    int countSquares(vector<vector<int>>& matrix) {
        int ans = 0;
        int n = matrix.size();
        int m = matrix[0].size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;ans += matrix[i][j++])
            {
                if(matrix[i][j] && i && j)
                    matrix[i][j] += min({matrix[i-1][j-1], matrix[i][j-1], matrix[i-1][j]});
            }
        }
        return ans;
    }
};
class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
    void dfs(vector<vector<int>>& image, int r, int c, int newColor, int oc)
    {
        int n = image.size();
        int m = image[0].size();
        if(r < 0 || r >= n || c < 0 || c > m || image[r][c] == newColor)
            return;
        if(image[r][c] == oc)
        {
            image[r][c] = newColor;
            dfs(image, r-1, c, newColor, oc);
            dfs(image, r+1, c, newColor, oc);
            dfs(image, r, c-1, newColor, oc);
            dfs(image, r, c+1, newColor, oc);
        }
    }
};
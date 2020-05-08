class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        int n = coordinates.size();
        if(n <= 2)
            return true;
        int y = coordinates[1][1] - coordinates[0][1], x = coordinates[1][0] - coordinates[0][0];
        for(int i=2;i<n;i++)
        {
            int yy = coordinates[i][1] - coordinates[i-1][1], xx = coordinates[i][0] - coordinates[i-1][0];
            if(yy * x != xx * y)
                return false;
        }
        return true;
    }
};
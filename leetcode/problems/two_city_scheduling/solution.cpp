class Solution {
public:
    int twoCitySchedCost(vector<vector<int>>& costs) {
        vector<int>v;
        int n = costs.size();
        int sum = 0;
        for(vector<int> price : costs)
        {
            sum += price[0];
            v.push_back(price[1] - price[0]); 
        }
        sort(v.begin(), v.end());
        for(int i = 0; i < n/2; i++)
            sum += v[i];
        return sum;
    }
};
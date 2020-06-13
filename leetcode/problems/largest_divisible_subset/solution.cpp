class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<int>v(n, 0);
        vector<int>par(n, 0);
        int m = 0, k = 0;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j<n;j++)
            {
                if(nums[j] % nums[i] == 0 && v[i] < 1 + v[j])
                {
                    v[i] = 1 + v[j];
                    par[i] = j;
                    if(v[i] > m)
                    {
                        m = v[i];
                        k = i;
                    }
                }
            }
        }
        vector<int>res;
        
        for(int i=0;i<m;i++)
        {
            res.push_back(nums[k]);
            k = par[k];
        }
        return res;
    }
};
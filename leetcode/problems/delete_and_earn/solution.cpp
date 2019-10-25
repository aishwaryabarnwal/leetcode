class Solution {
public:
    int deleteAndEarn(vector<int>& nums) {
        int n = nums.size();
        int r = 1;
        map<int, int>mp;
        for(int i=0;i<n;i++)
        {    
            mp[nums[i]]++;
            r = max(r, nums[i]);
        }
        int dp[r+1];
        memset(dp, 0, r+1);
        dp[0] = 0;
        dp[1] = mp[1];
        for(int i=2;i<=r;i++)
        {
            dp[i]=max(dp[i-1], dp[i-2]+i*mp[i]);
        }  
        return dp[r];
    }
};
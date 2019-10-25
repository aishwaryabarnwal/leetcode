class Solution {
public:
    int rob(vector<int>& nums) {
       int n = nums.size();
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        if(n==2)
            return max(nums[0], nums[1]);
        int dp0 = nums[0], dp1 = max(dp0, nums[1]);
        int dp2;
        for(int i=2;i<n;i++)
        {
            dp2 = max(dp0+nums[i], dp1);
            dp0 = dp1;
            dp1 = dp2;
        }
        return dp2;
    }
};
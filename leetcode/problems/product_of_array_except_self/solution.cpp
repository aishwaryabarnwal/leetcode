class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int>res(n, 1);
        int l = 1, r = 1;
        for(int i=1;i<n;i++)
        {
            l *= nums[i-1];
            r *= nums[n-i];
            res[i] *= l;
            res[n-i-1] *= r;
        }
        return res;
    }
};
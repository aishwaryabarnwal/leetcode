class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curr_max = 0;
        int max_sum = INT_MIN;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            curr_max = max(curr_max + nums[i], nums[i]);
             max_sum = max(max_sum, curr_max);
        } 
        return max_sum;
    }
};
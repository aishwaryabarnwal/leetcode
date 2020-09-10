class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        int prefix[n];
        memset(prefix, 0, sizeof(prefix));
        int ans = 0;
        int odd = 0;
        for(int i=0;i<n;i++)
        {
            prefix[odd]++;
            if(nums[i] & 1)
                odd++;
            if(odd >= k)
                ans += prefix[odd-k];
        }
        return ans;
        
    }
};
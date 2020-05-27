class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int, int> mp;
		mp[0] = -1;

		int res = 0, s = 0;
		for (int i=0;i<n;i++)
        {
			s += nums[i] ? 1 : -1;
			if (mp.find(s) != mp.end())
				res = max(i - mp[s], res);
			else
				mp[s] = i;
		}
		return res;
    }
};
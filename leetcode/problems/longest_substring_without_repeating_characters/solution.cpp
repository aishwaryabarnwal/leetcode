class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int start = 0, end = 0, res = 0;
        unordered_map<char, int> mp; 
        for (int i=0;i<n;i++)
        {
            if(mp.find(s[i]) != mp.end() && mp[s[i]] >= start)
                start = mp[s[i]] + 1;
            mp[s[i]] = i;
            res = max(res, (i - start) + 1);
            
        }
        return res;
    }
};
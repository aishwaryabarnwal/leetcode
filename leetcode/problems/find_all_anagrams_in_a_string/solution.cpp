class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        vector<int>v;
        int n = s.size();
        int count[26] = {0};
        for(char c : p) 
            count[c - 'a']++;
        int r = p.size(), j = 0;
        for(int i = 0; i< s.size(); i++)
        {
            while(j < s.size() && j - i < p.size())
            {
                if(count[s.at(j++) - 'a']-- > 0)
                    r--;
            }
            if(r == 0 && j - i == p.size()) 
                v.push_back(i);
            if(count[s.at(i) - 'a']++ >= 0) 
                r++;            
        }
        return v;
    }
};
class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        int count[26] = {0};
        for(char ch : s1)
            count[ch-'a']++;
        int i = 0, j = 0;
        int n = s1.size(), m = s2.size();
        while(j < m)
        {
            if(count[s2.at(j++) - 'a']-- > 0)
                n--;
            if(n == 0) 
                return true;
            if(j - i == s1.size() && count[s2.at(i++) - 'a']++ >= 0)
                n++;
        }
        return false;
    }
};
class Solution {
public:
    vector<string>ans;
    bool match(string s1, string s2)
    {
        map<char, char>mp1, mp2;
        int n1 = s1.size();
        int n2 = s2.size();
        if(n1!=n2)
            return 0;
        for(int i=0;i<n1;i++)
        {
            if(mp1.find(s1[i]) == mp1.end())
                mp1[s1[i]] = s2[i];
            if(mp2.find(s2[i]) == mp2.end())
                mp2[s2[i]] = s1[i];
            if(mp1[s1[i]]!=s2[i] || mp2[s2[i]]!=s1[i])
                return 0;
        }
        return 1;
    }
    vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
        for(int i=0;i<words.size();i++)
        {
             if(match(words[i], pattern))
                 ans.push_back(words[i]);
        }
        return ans;
    }
};
class Solution {
public:
    int numJewelsInStones(string J, string S) {
        unordered_map<char, int>mp;
        int res = 0;
        for(int i=0;i<J.size();i++)
            mp[J[i]]++;
        for(int i=0;i<S.size();i++)
        {
           if(mp[S[i]] != 0)
               res += mp[S[i]];
        }
        return res;
    }
};
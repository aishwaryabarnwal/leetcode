class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        unordered_map<char, int>mp;
        unordered_map<char, int>mpp;
        for(int i=0;i<magazine.size();i++)
            mp[magazine[i]]++;
        for(int i=0;i<ransomNote.size();i++)
            mpp[ransomNote[i]]++;
        for(int i=0;i<ransomNote.size();i++)
        {
            if(mp[ransomNote[i]] == 0 || mpp[ransomNote[i]] > mp[ransomNote[i]])
                return false;
        }
        return true;
    }
};
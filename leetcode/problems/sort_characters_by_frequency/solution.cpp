class Solution {
public:
    string frequencySort(string s) {
        int n = s.size();
        int count[256] = {0};
        for(char c : s)
            count[c]++;
        sort(s.begin(), s.end(), [&](char x, char y)
             {return count[x] > count[y] || (count[x] == count[y] && x < y);});
        return s;
    }
};
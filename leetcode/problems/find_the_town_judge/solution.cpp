class Solution {
public:
    int findJudge(int N, vector<vector<int>>& trust) {
        int n = trust.size();
        int a[1001] = {0};
        int b[1001] = {0};
        for(auto k : trust)
        {
            b[k[1]]++;
            a[k[0]]++;
        }
        for(int i=1;i<=N;i++)
        {
            if(a[i] == 0 && b[i] == N-1)
                return i;
        }
        return -1;
    }
};
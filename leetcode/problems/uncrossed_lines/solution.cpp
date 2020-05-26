class Solution {
public:
    int maxUncrossedLines(vector<int>& A, vector<int>& B) {
        int n = A.size();
        int m = B.size();
        if(n > m)
        {
            swap(n, m);
            swap(A, B);
        }
        vector<int> dp(m + 1);
        for (int i=0;i<n;i++) 
        {
            int z = 0;
            for (int j=0;j<m;j++) 
            {
                int x = dp[j + 1];
                if (A[i] == B[j]) 
                    dp[j + 1] = 1 + z;
                else 
                    dp[j + 1] = max(dp[j + 1], dp[j]);
                z = x;
            }
        }
        return dp[m];
    }
};
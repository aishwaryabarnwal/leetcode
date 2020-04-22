class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        int n = A.size();
        vector<int> v;
        for(int i=0;i<n;i++)
        {
            v.push_back(A[i] * A[i]);
        }
        sort(v.begin(), v.end());
        return v;
    }
};
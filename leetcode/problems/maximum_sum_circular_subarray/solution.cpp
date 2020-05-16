class Solution {
public:
    int maxSubarraySumCircular(vector<int>& A) {
        int maxi = INT_MIN, mini = INT_MAX, s1 = 0, s2 = 0, tot = 0;   
        for(auto i:A)
        {
            tot += i; 
            s1 += i; 
            s2 += i;
            maxi = max(maxi, s1);
            if(s1 < 0) 
                s1 = 0;
            mini = min(s2, mini);
            if(s2 > 0) 
                s2 = 0;
        }
        if(tot == mini) 
            return maxi;         
        else 
            return max(maxi, tot-mini);
    }
};
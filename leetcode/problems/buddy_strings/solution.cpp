class Solution {
public:
    bool buddyStrings(string A, string B) {
        int n = A.size();
        int m = B.size();
        int c = 0;
        if(n!=m)
            return false;
        vector<pair<char, char>> diff;
        unordered_map<char,int> um;
        for(int i=0;i<m;i++){
            if(A[i] != B[i])
               diff.push_back({A[i],B[i]});
            else
               um[A[i]]++;
    }
    if(diff.size() == 2){
        if(diff[0].first == diff[1].second and diff[0].second == diff[1].first)
            return true;
    }
    if(diff.size() == 0){
        for(auto& x:um)
            if(x.second > 1)
                return true;
    }
    return false;
    }
};
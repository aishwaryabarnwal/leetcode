class Solution {
public:
    vector<int> v;
    Solution(vector<int>& w) {
        for(int i : w)
        {
            if(v.empty())
                v.push_back(i);
            else
                v.push_back(i + v.back());
        }
    }
    
    int pickIndex() {
        int j = v.back();
        int x = rand() % j;
        auto itr = upper_bound(v.begin(), v.end(), x);
        return (itr - v.begin());
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(w);
 * int param_1 = obj->pickIndex();
 */
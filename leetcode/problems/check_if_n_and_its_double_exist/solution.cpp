class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        int n = arr.size();
        unordered_map<int, int> mp;
        for (int i : arr) 
        {
            if (mp.find(i) != mp.end())
                return true;
            if ( i%2 == 0 ) 
                mp[i/2] = 1;
                mp[i*2] = 1;
        }              
        return  false;       
    }
};
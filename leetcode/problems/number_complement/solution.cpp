class Solution {
public:
    int findComplement(int num) {
        vector<int> v;
        while(num)
        {
            v.push_back(num % 2);
            num /= 2;
        }
        int res = 0, i  = 0;
        for(int j=0;j<v.size();j++)
        {
            if(v[j] > 0)
                v[j] = 0;
            else 
                v[j] = 1;
            res += v[j] * pow(2, i);
            i++;
        }
        return res;
    }
};
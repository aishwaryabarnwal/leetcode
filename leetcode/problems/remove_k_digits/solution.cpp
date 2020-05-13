class Solution {
public:
    string removeKdigits(string num, int k) {
        int z = k;
        int n = num.size();
        if(k >= n)
          return "0";
        string res;
        for (char ch : num) 
        {
            while(k>0 && !res.empty() && res.back() > ch) 
            {
                res.pop_back();
                k--;
            }
            if (!(res.empty() && ch == '0')) 
                res.push_back(ch);
        }

    return (res.empty() ? "0" : res.substr(0,num.size()-z));       
    }
};
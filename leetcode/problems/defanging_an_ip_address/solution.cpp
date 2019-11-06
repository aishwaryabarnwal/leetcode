class Solution {
public:
    string defangIPaddr(string address) {
        int n = address.size();
        string x = "[.]";
        string s = "";
        for(int i=0;i<n;i++)
        {
            if(address[i]=='.')
                s += x;
            else
                s += address[i];
        }
        return s;
    }
};
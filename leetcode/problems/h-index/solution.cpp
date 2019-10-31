class Solution {
public:
    int hIndex(vector<int>& citations) 
    {
        citations.push_back(-1);
        int res = 0;
        sort(citations.begin(), citations.end());
        int l=citations.size();
        for(int i=1;i<l;i++)
        {
            if( l-i <= citations[i] && citations[i-1] <= l-i)
            {
               
                res=l-i;
                break;
            }
        }
        return res;
    }
};
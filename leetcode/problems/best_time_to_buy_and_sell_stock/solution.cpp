class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if(n==0 || n==1)
            return 0;
         int mele = prices[0];
         int mxp = prices[1] - prices[0];
         for(int i=0;i<n;i++)
         {
             if(prices[i]-mele > mxp)
                 mxp = prices[i]-mele;
             if(mele > prices[i])
                 mele = prices[i];
         }    
        if(mxp > 0)
            return mxp;
        else
            return 0;
    }
};
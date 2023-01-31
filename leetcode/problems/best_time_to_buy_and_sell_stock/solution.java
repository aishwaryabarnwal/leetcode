class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n==0 || n==1)
            return 0;
        int buy = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            buy = Math.min(buy, prices[i]);
            res = Math.max(res, prices[i]-buy);
        }
        return res;
    }
}
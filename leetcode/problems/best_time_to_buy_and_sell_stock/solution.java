class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
         if(n==0 || n==1)
            return 0;
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            buy = Math.min(prices[i], buy);
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}
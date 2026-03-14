class Solution {
    public int change(int amount, int[] coins) {
         int n = coins.length;
        Integer[][] dp = new Integer[n+1][amount+1];
        return solve(amount, coins, n, dp);
    }

    public int solve(int amount, int[] coins, int n, Integer[][] dp) {
        
        if(amount == 0)
            return 1;
        if(n == 0)
            return 0;
        if(dp[n][amount] != null)
            return dp[n][amount];
        if(coins[n-1] <= amount)
            return dp[n][amount] = solve(amount-coins[n-1], coins, n, dp) + solve(amount, coins, n-1, dp);
        else
            return dp[n][amount] = solve(amount, coins, n-1, dp);
    }
}
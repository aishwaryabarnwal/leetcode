class Solution {
    public int fib(int n) {
        int prev = 1, prev2 = 0;
        if(n == 0)
            return 0;
        for(int i=2;i<=n;i++)
        {
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // return fibonacci(dp, n);
    }
    // private int fibonacci(int[] dp, int n)
    // {
    //     if(n<=1)
    //         return n;
    //     if(dp[n] != -1)
    //         return dp[n];
    //     return dp[n] = fibonacci(dp, n-1) + fibonacci(dp, n-2);
    // }
}
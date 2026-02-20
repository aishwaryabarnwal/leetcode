class Solution {
    public double myPow(double x, int n) {
        
        long N = n;  // important (handle Integer.MIN_VALUE)
        if(N < 0)
            N = -N;
        double ans = 1;
        while(N > 0)
        {
            if(N % 2 != 0)
            {
                ans *= x;
                N = N - 1;
            }
            else
            {
                x *= x;
                N = N / 2;
            }
        }
        if(n < 0)
            return 1/ans;

        return ans;
    }
}
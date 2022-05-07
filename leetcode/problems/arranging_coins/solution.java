class Solution {
    public int arrangeCoins(int n) {
        
        long l = 0;
        long h = n ;
        while (l <= h) {
            long mid = l + (h - l) / 2;
            long coinsFilled = mid * (mid + 1) / 2;
            if (coinsFilled == n) {
                return (int) mid;
            }
            if (coinsFilled < n) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return (int)h;
    }
}
class Solution {
    public boolean isPowerOfTwo(int n) {
       // int result = (int)(Math.log(n) / Math.log(2));
        return n > 0 && (n & n - 1) == 0;
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n < 0)
            return false;
        long temp = 1;
        while(n > temp)
        {
            temp = temp << 2;
        }
        return n == temp;
    }
}
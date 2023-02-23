class Solution {
    public boolean isPowerOfThree(int n) {
        if(n < 0)
            return false;
        long temp = 1;
        while(n > temp)
        {
            temp = temp + (temp << 1);
        }
        return n==temp;
    }
}
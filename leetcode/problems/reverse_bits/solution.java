public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0, i=32;
        while(i>0)
        {
            rev <<= 1;
            if((n & 1) == 1)
                rev ^= 1;
            n >>= 1;
            i--;
        }
        return rev;
    }
}
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i = 32, count = 0;
        while(i>0)
        {
            if((n & 1) == 1)
                count++;
            n = n >> 1;
            i--;
        }
        return count;
    }
}
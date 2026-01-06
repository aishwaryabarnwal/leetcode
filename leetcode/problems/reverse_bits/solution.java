public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int rev = 0;
       for(int i=0;i<32;i++)
       {
            rev <<= 1; // shift result left
            rev |= (n & 1); // add last bit of n
            n >>>= 1; // unassigned right shift
       }
       return rev;
    }
}
class Solution {
    public int getSum(int a, int b) {
        // a ^ b → adds without carry
        // a & b → gives carry bits
        //<< 1 → shifts carry to correct position
        while(b != 0)
        {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
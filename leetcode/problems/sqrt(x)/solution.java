class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)
            return x;
        int i = 1;
        for(i=1;i<=x/i;i++)
        {
            if(i == x/i)
                return i;
        }
        return i-1;
    }
}
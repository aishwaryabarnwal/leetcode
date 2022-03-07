class Solution {
    public boolean isPalindrome(int x) {
        int res = 0, mod = 0;
        int rev = x;
        if(x < 0)
            return false;
        while(rev != 0)
        {
            mod = rev % 10;
            res = res * 10 + mod;
            rev /= 10;
        }
        if(x == res)
            return true;
        else 
            return false;
    }
}
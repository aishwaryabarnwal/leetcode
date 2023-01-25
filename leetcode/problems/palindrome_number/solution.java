class Solution {
    public boolean isPalindrome(int x) {
        int rev = x, rem = 0, div = 0;
        if(x < 0)
            return false;
        while(rev != 0)
        {
            rem = rev%10;
            div = div*10 + rem;
            rev = rev/10;
        }
        if(div == x)
            return true;
        return false;
    }
}